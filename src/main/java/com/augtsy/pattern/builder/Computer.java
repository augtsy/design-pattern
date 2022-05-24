package com.augtsy.pattern.builder;

import lombok.Data;
import lombok.ToString;

/**
 * @Description: 产品
 * 定义需要生产的产品 omputer
 * @Auther: tsy
 * @Date: 2022/05/24/4:10 下午
 */
@Data
@ToString
public class Computer {
    private String cpu;
    private String memory;
    private String disk;
}
