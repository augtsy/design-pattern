package com.augtsy.pattern.observer;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/30/3:05 下午
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer obs = new Concrete2Observer();
        Observer obs1 = new ConcreteObserver();
        Subject subject = new ConcreteSubject();
        subject.add(obs);
        subject.add(obs1);

        subject.notifyObserver("test-2");
    }
}
