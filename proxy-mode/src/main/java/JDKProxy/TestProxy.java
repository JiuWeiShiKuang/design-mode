package JDKProxy;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/5 10:41
 */
public class TestProxy {
    public static void main(String[] args) {
        JDKAgentProxy agentProxy = new JDKAgentProxy();
        IPerson zhangSan = agentProxy.getInstance(new zhangsan());
        zhangSan.findHourse();
        zhangSan.buyInsurance();

        IPerson lisi = agentProxy.getInstance(new LiSi());
        lisi.findHourse();
        lisi.buyInsurance();
    }
}
