package com.gp.factory.factoryMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 9:34
 */
public class Test1 {

    private  static Logger logger=LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        logger.info("开始 main方法。。。");
        ICourceFactory pythonCourseFactory=new PythonCourseFactory();
        ICource iCource=pythonCourseFactory.create();
        iCource.record();
    }
}
