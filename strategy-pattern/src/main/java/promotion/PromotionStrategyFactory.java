package promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 9:26
 */
public class PromotionStrategyFactory {
    private static Map<String,IPromotionStrategy> strategys = new HashMap<String, IPromotionStrategy>();

    static{
        strategys.put(promotionKey.CASHBACK,new CashbackStrategy());
        strategys.put(promotionKey.COUPON, new CouponStrategy());
        strategys.put(promotionKey.GROUPBUY,new GroupbuyStrategy());
    }

    private static final IPromotionStrategy empty = new EmptyStrategy();

    public PromotionStrategyFactory() {
    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy promotionStrategy = strategys.get(promotionKey);
        return promotionStrategy == null ? empty :promotionStrategy;
    }

    private interface promotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

    public static Set<String> getPromotionKeys(){
        return strategys.keySet();
    }

}
