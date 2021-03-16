package pay;

/**
 * @Description:  支付  策略模式
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 16:02
 */
public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("1", "123456789", 100.00);
        String payKey = "WECHARTPAY";
        MsgResult resultMsg = order.pay(payKey);
        System.out.println(resultMsg);
    }
}
