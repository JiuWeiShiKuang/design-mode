package CGLibProxy;


/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/5 10:41
 */
public class TestCGLibProxy {
    public static void main(String[] args) {
        CGLibAgentProxy agentProxy = new CGLibAgentProxy();
        IPerson zhangSan = (IPerson) agentProxy.getInstance(zhangsan.class);
        zhangSan.findHourse();
        zhangSan.buyInsurance();

        IPerson lisi = (IPerson) agentProxy.getInstance(LiSi.class);
        lisi.findHourse();
        lisi.buyInsurance();
    }
}
