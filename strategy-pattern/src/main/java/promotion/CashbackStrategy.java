package promotion;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 9:21
 */
public class CashbackStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
