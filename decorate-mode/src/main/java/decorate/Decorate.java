package decorate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/8 10:18
 */
public abstract class Decorate extends PancakeComponent{
    private PancakeComponent pancakeComponent;

    public Decorate(PancakeComponent pancakeComponent) {
        this.pancakeComponent = pancakeComponent;
    }

    @Override
    protected String getMsg() {
        return this.pancakeComponent.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.pancakeComponent.getPrice();
    }
}
