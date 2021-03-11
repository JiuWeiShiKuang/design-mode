package delegate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 16:10
 */
public class EmployeeA implements IEmployee{
    protected String goodAt = "UI";

    public void doing(String task) {
        System.out.println("我是A员工我擅长"+goodAt+"现在开始做"+task);
    }
}
