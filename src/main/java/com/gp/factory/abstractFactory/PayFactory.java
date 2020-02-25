package com.gp.factory.abstractFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 11:23
 */
public interface PayFactory {

    //根据国内和国外的不同做一个初始化操作
      void init();

      IPay createPay();

      IRecharge createRecharge();
}
