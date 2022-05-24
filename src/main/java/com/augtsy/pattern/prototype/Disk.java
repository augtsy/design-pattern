package com.augtsy.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/24/5:04 下午
 */
@AllArgsConstructor
@ToString
public class Disk implements Cloneable {

    private String ssd;
    private String hhd;

    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
