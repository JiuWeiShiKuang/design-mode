package adapter;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/9 14:35
 */
public class PowerAdapter implements DC {
    private AC220v ac220v;

    public PowerAdapter(AC220v ac220v) {
        this.ac220v = ac220v;
    }

    public int outPut5V() {
        int outPut220V = ac220v.outPut220V();
        int outPut = outPut220V /44;
        System.out.println("使用adapter输入AC" + outPut220V + "V，输出 DC" + outPut +"V");
        return outPut;
    }

    public int outPut12V() {
        return 0;
    }

    public int outPut36V() {
        return 0;
    }

    public int outPut110V() {
        return 0;
    }
}
