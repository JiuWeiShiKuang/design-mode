package delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 16:18
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> employee = new HashMap<String, IEmployee>();

    public Leader() {
        employee.put("编程",new EmployeeB());
        employee.put("UI",new EmployeeA());
    }


    public void doing(String task) {
        if (! employee.containsKey(task)){
            System.out.println("这个任务"+task+"超出了我的能力范围");
            return;
        }
        employee.get(task).doing(task);
    }
}
