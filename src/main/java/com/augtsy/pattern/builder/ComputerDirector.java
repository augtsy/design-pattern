package com.augtsy.pattern.builder;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/24/4:18 下午
 */
public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildDisk();
        return computerBuilder.buildComputer();
    }
}
