package com.augtsy.pattern.sngleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDestroyTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = InnerClassSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 强制访问
        constructor.setAccessible(true);
        InnerClassSingleton newInstance = (InnerClassSingleton) constructor.newInstance();

        InnerClassSingleton instance = InnerClassSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

}
