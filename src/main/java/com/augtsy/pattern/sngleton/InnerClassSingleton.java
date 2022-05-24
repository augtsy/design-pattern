package com.augtsy.pattern.sngleton;

/**
 * @Description: 静态内部类单例模式
 * 第一次加载StaticClassSingleton类时，并不会实例化instance，
 * 只有第一次调用getInstance方法时，Java虚拟机才会去加载StaticClassSingletonHolder类，
 * 继而实例化instance，这样延时实例化instance，节省了内存，并且也是线程安全的。这是推荐使用的一种单例模式。
 * @Auther: tsy
 * @Date: 2022/05/24/3:18 下午
 */
public class InnerClassSingleton {

    /**
     * 删除if判断，可被反射破坏
     *
     * @see com.augtsy.pattern.sngleton.ReflectionDestroyTest
     */
    private InnerClassSingleton() {
        if (SingletonHolder.instance != null) {
            throw new RuntimeException("单例模式禁止反射创建实例！");
        }
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        //静态初始化器，由JVM来保证线程安全
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
}
