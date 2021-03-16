package loginChain;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 11:07
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (!StringUtils.equals("管理员",member.getRoleName())){
            System.out.println("你不是管理员，没有操作权限！");
            return;
        }
        System.out.println("你是管理员，允许操作！");
    }
}
