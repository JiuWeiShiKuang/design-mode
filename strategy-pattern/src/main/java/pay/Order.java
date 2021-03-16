package pay;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 15:48
 */
public class Order {
    private String uid;
    private String orderId;
    private Double amount;

    public Order(String uid, String orderId, Double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.getPayment(payKey);
        String name = payment.getName();
        System.out.println("欢迎使用" + name);
        System.out.println("本次支付金额为" + amount + "开始扣款");
        return payment.pay(uid,amount);
    }
}
