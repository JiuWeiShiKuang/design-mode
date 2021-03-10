package adapter;

/**
 * @Description: 测试适配器模式
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/9 14:57
 */
public class TestAdapter {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220v());
        powerAdapter.outPut5V();
    }
}
