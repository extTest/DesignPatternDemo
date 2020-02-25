package com.gp.factory.factoryMethod;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 10:25
 */
public class PythonCourseFactory implements ICourceFactory{
    @Override
    public ICource create() {
        return new PythonCource();
    }
}
