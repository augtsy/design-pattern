package com.augtsy.pattern.factory.simple;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/20/4:48 下午
 */
public class PhoneFactory {

    public static Phone createPhone(String phoneName) {
        if ("HuaWei".endsWith(phoneName)) {
            return new HuaWei();
        } else if ("Apple".endsWith(phoneName)) {
            return new Iphone();
        } else {
            return null;
        }
    }
}
