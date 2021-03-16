package pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 15:36
 */
public class PayStrategy {
    private static Map<String,Payment> paymentMap = new HashMap<String, Payment>();

    static {
        paymentMap.put(getPaymentMapKey.ALIPAY,new AliPay());
        paymentMap.put(getPaymentMapKey.UNIONPAY,new UnionPay());
        paymentMap.put(getPaymentMapKey.WECHARTPAY,new WechartPay());
    }
    private static final Payment defaultPay = new AliPay();

    public static Payment getPayment(String paymentKey){
        Payment payment = paymentMap.get(paymentKey);
        return payment == null ? defaultPay : payment;
    }

    private interface getPaymentMapKey{
        String ALIPAY = "ALIPAY";
        String WECHARTPAY = "WECHARTPAY";
        String UNIONPAY = "UNIONPAY";
    }

}
