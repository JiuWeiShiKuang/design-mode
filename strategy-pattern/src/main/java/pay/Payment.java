package pay;

/**
 * @Description: 支付渠道
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/15 14:46
 */
public abstract class Payment {
    public abstract String getName();

    public MsgResult pay(String uid,Double amount){
        if (queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额"+amount);
    }

    protected abstract double queryBalance(String uid);
}
