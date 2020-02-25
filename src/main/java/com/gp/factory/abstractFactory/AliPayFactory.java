package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:40
 */
public class AliPayFactory extends ChinaPayFactory {
    @Override
    ISettlement createSettlement() {
        return new AliSettlement();
    }

    @Override
    public IPay createPay() {
        return new AliPay();
    }

    @Override
    public IRecharge createRecharge() {
        return new AliRecharge();
    }
}
