package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:49
 */
public class ApplePay implements IPay{
    @Override
    public int pay() {
        System.out.println("苹果支付成功");
        return 1;
    }
}
