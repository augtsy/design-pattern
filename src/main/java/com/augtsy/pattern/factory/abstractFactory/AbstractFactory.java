package com.augtsy.pattern.factory.abstractFactory;

import com.augtsy.pattern.factory.simple.Phone;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/5:11 下午
 */
public abstract class AbstractFactory {
    public abstract Phone createPhone(String brand);

    public abstract Computer createComputer(String brand);
}
