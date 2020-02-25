package com.gp.factory.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 9:34
 */
public class Test1 {

    private  static Logger logger=LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        ICourceFactory factory=new ICourceFactory();
        ICource iCource=factory.create(JavaCourse.class);
        logger.info("开始 main方法。。。");
        iCource.record();
    }
}
