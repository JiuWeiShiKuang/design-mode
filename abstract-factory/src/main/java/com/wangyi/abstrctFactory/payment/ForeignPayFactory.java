package com.wangyi.abstrctFactory.payment;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/3/15 21:20
 */
public class ForeignPayFactory extends AbstractPamentFactory{
   protected Payment createApplePay(){
       super.init();
       return new ApplePay();
   }
   protected Payment createCardPay(){
       super.init();
       return new CardPay();
   }

}
