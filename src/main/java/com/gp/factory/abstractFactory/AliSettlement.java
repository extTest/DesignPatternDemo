package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:42
 */
public class AliSettlement implements ISettlement {
    @Override
    public int settlement() {
        System.out.println("支付宝向银行结算成功 ");
        return 1;
    }
}
