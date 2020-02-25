package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:51
 */
public class Test1 {
    public static void main(String[] args) {

        //国内支付
        ChinaPayFactory aliPayFactory=new AliPayFactory();
        aliPayFactory.createPay().pay();
        aliPayFactory.createRecharge().recharge();
        aliPayFactory.createSettlement().settlement();
        System.out.println("--------------------------------------------------");
        //国外支付
        ForeignCountryPayFactory applePayFactory=new ApplePayFactory();
        applePayFactory.createPay().pay();
        applePayFactory.createRecharge().recharge();
    }
}
