package com.augtsy.pattern.sngleton;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/24/3:31 下午
 */
public enum EnumSingleton {

    //枚举实例的创建是线程安全的，任何情况下都是单例（包括反序列化）
    INSTANCE;

    public void doSomething() {

    }
}
