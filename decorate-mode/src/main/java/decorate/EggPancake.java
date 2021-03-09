package decorate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/8 10:23
 */
public class EggPancake extends Decorate {

    public EggPancake(PancakeComponent pancakeComponent) {
        super(pancakeComponent);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() +"+鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
