package com.augtsy.pattern.sngleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 *
 * @Description: 懒汉式单例模式
 * @Auther: tsy
 * @Date: 2022/05/24/2:22 下午
 * </p>
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 增加synchronized关键字，该方法为同步方法，保证多线程单例对象唯一
     *
     * @return
     */
    public static synchronized LazySingleton getSafeInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
