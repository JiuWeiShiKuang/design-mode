package com.wangyi.abstrctFactory.payment;

/*
 * @Author wangyi 工厂模式设计支付业务场景，包含跨境支付，支付宝、微信、银联支付
 * @Description
 * @Date 2021/3/15 21:24
 */
public class PaymentTest {
    public static void main(String[] args) {
        ChinaPayFactory chinaPayFactory = new ChinaPayFactory();
        chinaPayFactory.createAliPay().doPay();
        chinaPayFactory.createUnionPay().doPay();
        chinaPayFactory.createWechatPay().doPay();

        ForeignPayFactory foreignPayFactory = new ForeignPayFactory();
        foreignPayFactory.createApplePay().doPay();
        foreignPayFactory.createCardPay().doPay();
    }
}
