package loginChain;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/16 10:54
 */
public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getPassword())){
            System.out.println("用户名和密码不能为空！");
            return;
        }
        System.out.println("用户名和密码校验成功，可以往下执行！");
        chain.doHandler(member);
    }
}
