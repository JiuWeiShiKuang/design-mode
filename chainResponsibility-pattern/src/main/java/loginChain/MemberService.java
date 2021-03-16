package loginChain;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 11:12
 */
public class MemberService {
    public void login(String loginName,String password){
        ValidateHandler validateHandler = new ValidateHandler();
        LoginHandler loginHandler = new LoginHandler();
        AuthHandler authHandler = new AuthHandler();

        Handler.Builder builder = new Handler.Builder();
        builder.addBuilder(validateHandler)
                .addBuilder(loginHandler)
                .addBuilder(authHandler)
                .build()
                .doHandler(new Member(loginName,password));
    }
}
