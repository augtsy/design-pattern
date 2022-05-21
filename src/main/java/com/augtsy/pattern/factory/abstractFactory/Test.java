package com.augtsy.pattern.factory.abstractFactory;

import com.augtsy.pattern.factory.simple.Phone;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/5:32 下午
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory phoneFactory = new PhoneFactory();
        Phone phoneHuawei = phoneFactory.createPhone("HuaWei");
        Phone phoneApple = phoneFactory.createPhone("Apple");
        System.out.println(phoneHuawei.brand());
        System.out.println(phoneApple.brand());
        System.out.println("===================");

        AbstractFactory computerFactory = new ComputerFactory();
        Computer computerHuawei = computerFactory.createComputer("HuaWei");
        Computer computerApple = computerFactory.createComputer("Apple");
        System.out.println(computerHuawei.internet());
        System.out.println(computerApple.internet());
    }
}
