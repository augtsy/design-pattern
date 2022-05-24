package com.augtsy.pattern.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 实现构造和装配
 * @Auther: tsy
 * @Date: 2022/05/24/4:15 下午
 */
@Slf4j
public class ComputerConcreteBuilder implements ComputerBuilder {

    Computer computer;

    public ComputerConcreteBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        log.info("build cpu.......");
        computer.setCpu("cpu");
    }

    @Override
    public void buildMemory() {
        log.info("build memory.......");
        computer.setMemory("memory");
    }

    @Override
    public void buildDisk() {
        log.info("build disk.......");
        computer.setDisk("disk");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
