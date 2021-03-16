package loginChain;

/**
 * @Description: 责任链模式  模拟登录流程
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 11:27
 */
public class Test {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("zhangsan","000");
    }
}
