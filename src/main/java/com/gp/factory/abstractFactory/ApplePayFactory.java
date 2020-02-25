package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:48
 */
public class ApplePayFactory extends ForeignCountryPayFactory {
    @Override
    public IPay createPay() {
        return new ApplePay();
    }

    @Override
    public IRecharge createRecharge() {
        return new ApplyRecharge();
    }
}
