package com.augtsy.pattern.prototype;

import lombok.ToString;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/24/4:38 下午
 */
@ToString
public class Computer implements Cloneable {

    private String cpu;
    private String memory;
    private String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
