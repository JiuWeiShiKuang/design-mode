package bridge;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 9:24
 */
public abstract class BridgeMessage {
    private IMessage iMessage;

    public BridgeMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    public void sendMessage(String message,String toUser){
        this.iMessage.sendMessage(message,toUser);
    }
}
