package decorate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/8 11:17
 */
public class Test {
    public static void main(String[] args) {
        //普通煎饼
        ConcretePancakeComponent concretePancakeComponent = new ConcretePancakeComponent();
        System.out.println(concretePancakeComponent.getMsg() + "总价"+concretePancakeComponent.getPrice());
        //加鸡蛋煎饼
        EggPancake eggPancake = new EggPancake(concretePancakeComponent);
        System.out.println(eggPancake.getMsg() +"总价"+eggPancake.getPrice());

        //加两个鸡蛋
        EggPancake eggPancake2 = new EggPancake(eggPancake);
        System.out.println(eggPancake2.getMsg() +"总价"+eggPancake2.getPrice());

        //加鸡蛋加香肠煎饼
        SausagePancake sausagePancake = new SausagePancake(eggPancake);
        System.out.println(sausagePancake.getMsg() +"总价:"+sausagePancake.getPrice());

    }
}
