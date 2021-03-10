package bridge;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 9:29
 */
public class UrgentMessage extends BridgeMessage {
    public UrgentMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急" + message;
        super.sendMessage(message, toUser);
    }

}
