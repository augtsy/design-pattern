package com.augtsy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类
 *
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/30/2:50 下午
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    // 添加观察者
    public void add(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者的抽象方法
    public abstract void notifyObserver(String message);

}
