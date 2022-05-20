package com.augtsy.designpattern.factorypattern.simple;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/4:47 下午
 */
public class HuaWei implements Phone {
    @Override
    public String brand() {
        return "这是生产华为的工厂";
    }
}
