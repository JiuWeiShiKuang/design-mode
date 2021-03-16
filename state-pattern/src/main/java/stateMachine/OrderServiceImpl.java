package stateMachine;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.persist.StateMachinePersister;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 16:36
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private StateMachine<OrderStatus,OrderStatusChangeEvent> orderStateMachine;
    @Autowired
    private StateMachinePersister<OrderStatus,OrderStatusChangeEvent,Order> persister;
    private int id = 1;
    private Map<Integer, Order> orders = new HashMap<Integer, Order>();

    public Order create() {
        Order order = new Order();
        order.setOrderStatus(OrderStatus.WAIT_PAYMENT);
        order.setId(id++);
        orders.put(order.getId(),order);
        return order;
    }

    public Order pay(int id) {
        Order order = orders.get(id);
        System.out.println("线程名称：" + Thread.currentThread().getName() + "尝试支付，订单号："+id);
        Message<OrderStatusChangeEvent> message = MessageBuilder.withPayload(OrderStatusChangeEvent.PAYED).setHeader("order", order).build();
        if (!sendEvent(message,order)){
            System.out.println("线程名称：" + Thread.currentThread().getName() + "支付失败，订单号："+id);
        }
        return orders.get(id);
    }

    public Order deliver(int id) {
        Order order = orders.get(id);
        System.out.println("线程名称：" + Thread.currentThread().getName() + "尝试发货，订单号："+id);
        if (!sendEvent(MessageBuilder.withPayload(OrderStatusChangeEvent.DELIVERY).setHeader("order",order).build(),orders.get(id))){
            System.out.println("线程名称：" + Thread.currentThread().getName() + "发货失败，状态异常，订单号："+id);
        }
        return orders.get(id);
    }

    public Order receive(int id) {
        Order order = orders.get(id);
        System.out.println("线程名称：" + Thread.currentThread().getName() + "尝试收货，订单号："+id);
        if (!sendEvent(MessageBuilder.withPayload(OrderStatusChangeEvent.RECEIVED).setHeader("order",order).build(),orders.get(id))){
            System.out.println("线程名称：" + Thread.currentThread().getName() + "收货失败，状态异常，订单号："+id);
        }
        return orders.get(id);
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    /**
     * 发送订单状态转换事件
     */
    private synchronized boolean sendEvent(Message<OrderStatusChangeEvent> message, Order order) {
        boolean result = false;
        try {
            orderStateMachine.start();
            //尝试恢复状态机状态
            persister.restore(orderStateMachine,order);
            //添加延迟用于线程安全测试
            Thread.sleep(1000);
            result = orderStateMachine.sendEvent(message);
            //持久化状态机状态
            persister.persist(orderStateMachine,order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
