package com.augtsy.pattern.observer;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/30/2:59 下午
 */
public class Concrete2Observer implements Observer {

    private static final Log log = LogFactory.getLog(Concrete2Observer.class);

    @Override
    public void dataChange(String message) {
        log.info(" recive message2 :" + message);
    }
}
