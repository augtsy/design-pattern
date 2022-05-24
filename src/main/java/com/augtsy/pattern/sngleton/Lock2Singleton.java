package com.augtsy.pattern.sngleton;

/**
 * @Description: 双重锁
 * @Auther: tsy
 * @Date: 2022/05/24/2:32 下午
 */
public class Lock2Singleton {

    //增加volatile关键字，确保实例化instance时，编译成汇编指令的执行顺序
    private volatile static Lock2Singleton lock2Singleton;

    private Lock2Singleton() {
    }

    public static Lock2Singleton getInstance() {
        if (lock2Singleton == null) {
            synchronized (Lock2Singleton.class) {
                //当第一次调用getInstance方法时，即instance为空时，同步操作，保证多线程实例唯一
                //当以后调用getInstance方法时，即instance不为空时，不进入同步代码块，减少了不必要的同步开销
                if (lock2Singleton == null) {
                    lock2Singleton = new Lock2Singleton();
                }
            }
        }
        return lock2Singleton;
    }
}
