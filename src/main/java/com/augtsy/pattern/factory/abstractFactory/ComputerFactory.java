package com.augtsy.pattern.factory.abstractFactory;

import com.augtsy.pattern.factory.simple.Phone;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/5:19 下午
 */
public class ComputerFactory extends AbstractFactory {

    @Override
    public Phone createPhone(String brand) {
        return null;
    }

    @Override
    public Computer createComputer(String brand) {
        if ("HuaWei".equals(brand)) {
            return new ComputerHuaWei();
        } else if ("Apple".equals(brand)) {
            return new ComputerApple();
        } else {
            return null;
        }
    }
}
