package promotion;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 9:23
 */
public class GroupbuyStrategy implements IPromotionStrategy {
    public void doPromotion() {
        System.out.println("5人成团可以优惠");
    }
}
