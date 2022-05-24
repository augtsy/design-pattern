package com.augtsy.pattern.sngleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description: 饿汉式单例模式
 * @Auther: tsy
 * @Date: 2022/05/24/2:30 下午
 */
public class HungrySingleton {

    //static final单例对象，类加载的时候就初始化
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * 在 class Loader 完成后该类的实例便已经存在于 JVM 中了,线程安全
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
