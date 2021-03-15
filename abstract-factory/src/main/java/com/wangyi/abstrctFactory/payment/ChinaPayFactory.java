package com.wangyi.abstrctFactory.payment;

/*
 * @Author wangyi 国内支付
 * @Description
 * @Date 2021/3/15 21:20
 */
public class ChinaPayFactory extends AbstractPamentFactory{
    protected Payment createAliPay() {
        super.init();
        return new AliPay();
    }

    protected Payment createWechatPay() {
        super.init();
        return new WechatPay();
    }

    protected Payment createUnionPay() {
        super.init();
        return new UnionPay();
    }
}
