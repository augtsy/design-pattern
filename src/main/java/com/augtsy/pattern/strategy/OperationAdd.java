package com.augtsy.pattern.strategy;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/3:03 下午
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
