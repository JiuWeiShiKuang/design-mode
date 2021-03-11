package delegate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 16:44
 */
public class Boss {
    public void commands(String task,Leader leader){
        leader.doing(task);
    }
}
