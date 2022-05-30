package com.augtsy.pattern.observer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/30/2:53 下午
 */
public class ConcreteSubject extends Subject {

    private final static Log logger = LogFactory.getLog(ConcreteSubject.class);

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.dataChange(message);
        }
    }
}
