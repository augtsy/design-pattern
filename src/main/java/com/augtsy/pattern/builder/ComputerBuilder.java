package com.augtsy.pattern.builder;

/**
 * @Description: 抽象接口
 * 描述产品构造和装配的过程
 * @Auther: tsy
 * @Date: 2022/05/24/4:13 下午
 */
public interface ComputerBuilder {

    void buildCpu();

    void buildMemory();

    void buildDisk();

    Computer buildComputer();
}
