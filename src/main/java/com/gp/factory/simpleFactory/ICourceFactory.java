package com.gp.factory.simpleFactory;


import org.slf4j.LoggerFactory;

/**
 * @Author: leijinhua
 * @Date: 2020-2-25 9:29
 */
public class ICourceFactory {
    public  ICource create(Class<? extends ICource> clazz){
        try {
            if(null!=clazz) {
                return (ICource) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
