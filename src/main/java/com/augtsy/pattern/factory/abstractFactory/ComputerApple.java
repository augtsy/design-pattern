package com.augtsy.pattern.factory.abstractFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/5:12 下午
 */
public class ComputerApple implements Computer {
    @Override
    public String internet() {
        return "生产苹果电脑";
    }
}
