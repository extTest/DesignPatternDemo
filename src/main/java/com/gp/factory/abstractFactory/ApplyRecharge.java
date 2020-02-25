package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:50
 */
public class ApplyRecharge implements IRecharge {
    @Override
    public int recharge() {
        System.out.println("向苹果pay充值成功");
        return 1;
    }
}
