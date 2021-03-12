package courseTemplate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/12 16:27
 */
public abstract class AbstractCourse {
    public final void createCourse(){
        //发布预习资料
        postPreResourse();
        //制作课件
        creatPPT();
        //直播授课
        liveVideo();
        //上传课后资料
        postResource();
        //布置作业
        postHomework();
        if (needCheckHomework()){
            //检查作业
            checkHomework();
        }
    }

    protected boolean needCheckHomework() {
        return false;
    }

    protected void checkHomework() {
        System.out.println("检查作业");
    }

    protected void postHomework() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("直播授课");
    }

    protected  void postPreResourse(){
        System.out.println("发布预习资料");
    };

    protected void creatPPT(){
        System.out.println("制作课件");
    };
}
