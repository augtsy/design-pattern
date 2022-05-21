package com.augtsy.pattern.factory.abstractFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/5:13 下午
 */
public class ComputerHuaWei implements Computer {
    @Override
    public String internet() {
        return "生产华为电脑";
    }
}
