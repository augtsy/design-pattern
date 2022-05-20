package com.augtsy.designpattern.factorypattern.simple;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/4:46 下午
 */
public class Iphone implements Phone {
    @Override
    public String brand() {
        return "这是生产苹果的工厂";
    }
}
