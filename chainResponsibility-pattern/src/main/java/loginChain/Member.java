package loginChain;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 10:42
 */
public class Member {

    private String loginName;
    private String password;
    private String roleName;

    public Member(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
