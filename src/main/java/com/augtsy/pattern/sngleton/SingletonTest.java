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
public class SingletonTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 10; i++) {
            // 饿汉式单例
            executorService.submit(() -> System.out.println(HungrySingleton.getInstance()));
            // 懒汉式单例 线程不安全
            executorService.submit(() -> System.out.println(LazySingleton.getInstance()));
            // 懒汉式单例 线程安全 方法上加锁
            executorService.submit(() -> System.out.println(LazySingleton.getSafeInstance()));
            // 懒汉式单例 线程安全 double check
            executorService.submit(() -> System.out.println(Lock2Singleton.getInstance()));
            // 静态内部类
            executorService.submit(() -> System.out.println(InnerClassSingleton.getInstance()));
            // 枚举类单例
            executorService.submit(() -> System.out.println(EnumSingleton.INSTANCE));
        }
        executorService.shutdown();
    }


}
