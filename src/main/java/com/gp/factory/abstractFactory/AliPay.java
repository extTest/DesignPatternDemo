package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:43
 */
public class AliPay implements IPay {
    @Override
    public int pay() {
        System.out.println("使用支付宝支付成功");
        return 1;
    }
}
