package com.wangyi.abstrctFactory.payment;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/3/15 21:14
 */
public class CardPay implements Payment {
    public void doPay() {
        System.out.println("境外卡支付");
    }
}
