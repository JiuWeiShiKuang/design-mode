package delegate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 16:46
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commands("编程",new Leader());
        boss.commands("UI",new Leader());
        boss.commands("IOS",new Leader());
//        Leader leader = new Leader();
//        leader.doing("编程");
//        leader.doing("UI");
//        leader.doing("IOS");
    }
}
