package com.augtsy.pattern.factory.abstractFactory;

import com.augtsy.pattern.factory.simple.HuaWei;
import com.augtsy.pattern.factory.simple.Iphone;
import com.augtsy.pattern.factory.simple.Phone;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/5:14 下午
 */
public class PhoneFactory extends AbstractFactory {

    @Override
    public Phone createPhone(String brand) {
        if ("HuaWei".endsWith(brand)) {
            return new HuaWei();
        } else if ("Apple".endsWith(brand)) {
            return new Iphone();
        } else {
            return null;
        }
    }

    @Override
    public Computer createComputer(String brand) {
        return null;
    }
}
