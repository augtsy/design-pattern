package com.augtsy.pattern.decorator;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/2:17 下午
 */
public class DecoratorTest {

    public static void main(String[] args) {
        SourceAble source = new Source();
        SourceAble obj = new Decorator(source);
        obj.createComputer();
    }
}
