package adapter;

/**
 * @Description: adaptee源对象
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/9 14:32
 */
public class AC220v {
    public int outPut220V(){
        int outPut = 220;
        System.out.println("输出电压："+outPut+"V");
        return outPut;
    }
}
