package com.augtsy.pattern.adapter.clazz;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:11 上午
 */
public class ClazzAdapterTest {
    public static void main(String[] args) {

        TargetAble target = new Adapter();
        target.editTextFile();
        target.editWordFile();
    }

}
