package decorate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/8 10:24
 */
public class SausagePancake extends Decorate {

    public SausagePancake(PancakeComponent pancakeComponent) {
        super(pancakeComponent);
    }

    @Override
    public String getMsg() {
        return super.getMsg() +"+香肠";
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 2;
    }
}
