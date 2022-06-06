package com.augtsy.pattern.template;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/2:02 下午
 */
public class TemplateTest {

    public static void main(String[] args) {
        //办理取钱流程
        AbstractTemplate template1 = new TakeMoney();
        template1.templateMethod();
        //办理存储流程
        AbstractTemplate template2 = new SaveMoney();
        template2.templateMethod();
    }
}
