package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:44
 */
public class AliRecharge implements IRecharge {
    @Override
    public int recharge() {
        System.out.println("向支付宝充值成功");
        return 1;
    }
}
