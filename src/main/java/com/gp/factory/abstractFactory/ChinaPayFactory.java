package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:27
 */
public abstract  class ChinaPayFactory implements PayFactory {
    @Override
    public void init() {
        System.out.println("这是国内支付...");
    }

    //国内的支付都需要向央行结算,返回结算对象
    abstract ISettlement createSettlement();
}
