package courseTemplate;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/12 17:01
 */
public class JavaCourse extends AbstractCourse {
    private boolean needCheckHomework = false;

    public void setNeedCheckHomework(Boolean needCheckHomework){
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("java课程需要检查作业");
    }
}
