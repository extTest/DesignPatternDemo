package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:27
 */
public abstract  class ForeignCountryPayFactory implements PayFactory {
    @Override
    public void init() {
        System.out.println("这是国外支付...");
    }
}
