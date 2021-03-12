package courseTemplate;

/**
 * @Description:  模板方法模式
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/12 17:02
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(true);
        javaCourse.createCourse();

        System.out.println("==================================================");
        PhpCourse phpCourse = new PhpCourse();
        phpCourse.createCourse();
    }
}
