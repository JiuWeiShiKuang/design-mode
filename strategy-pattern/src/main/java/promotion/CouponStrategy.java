package promotion;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 9:19
 */
public class CouponStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("使用优惠券折扣");
    }
}
