package promotion;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 9:24
 */
public class EmptyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
