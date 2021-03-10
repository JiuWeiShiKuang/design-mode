package bridge;

/**
 * @Description:
 * @author: wy
 * @copyright: 雪城软件有限公司
 * @CreatedDate: 2021/3/10 9:32
 */
public class BridgePatternTest {
    public static void main(String[] args) {

        WeChartMessage weChartMessage = new WeChartMessage();
        NomalMessage nomalMessage = new NomalMessage(weChartMessage);
        nomalMessage.sendMessage("加班申请","张三");

        EmailMessage emailMessage = new EmailMessage();
        UrgentMessage urgentMessage = new UrgentMessage(emailMessage);
        urgentMessage.sendMessage("加班申请","张三");
    }
}

