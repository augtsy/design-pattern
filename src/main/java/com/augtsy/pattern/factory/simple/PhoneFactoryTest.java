package com.augtsy.pattern.factory.simple;

import java.util.Objects;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/4:50 下午
 */
public class PhoneFactoryTest {
    public static void main(String[] args) {
        Phone apple = PhoneFactory.createPhone("Apple");
        if (Objects.nonNull(apple)) {
            String brand = apple.brand();
            System.out.println("brand = " + brand);
        } else {
            throw new RuntimeException("non phone factory");
        }

        System.out.println("=============================");

        Phone huaWei = PhoneFactory.createPhone("HuaWei");
        if (Objects.nonNull(huaWei)) {
            String brand = huaWei.brand();
            System.out.println("brand = " + brand);
        } else {
            throw new RuntimeException("non phone factory");
        }
    }
}
