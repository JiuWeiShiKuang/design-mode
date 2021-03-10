package bridge;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 9:21
 */
public class EmailMessage implements IMessage {
    public void sendMessage(String message,String toUser) {
        System.out.println("用Email发送"+message+"消息，给"+toUser);
    }
}
