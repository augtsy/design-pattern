package com.augtsy.pattern.strategy;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/3:04 下午
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
