package com.augtsy.pattern.builder;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/24/4:20 下午
 */
public class BuilderTest {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerConcreteBuilder concreteBuilder = new ComputerConcreteBuilder();

        Computer computer = computerDirector.constructComputer(concreteBuilder);
        System.out.println("computer = " + computer);

    }
}
