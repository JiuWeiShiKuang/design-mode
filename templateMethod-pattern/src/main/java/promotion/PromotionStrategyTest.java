package promotion;

import java.util.Set;

/**
 * @Description: 策略模式   实现优惠券场景
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 10:44
 */
public class PromotionStrategyTest {
    public static void main(String[] args) {
        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();
       for (String promotionKey:promotionKeys){
           System.out.println("优惠活动"+ promotionKey);
       }

       String promotionKey = "COUPON";
        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();

    }
}
