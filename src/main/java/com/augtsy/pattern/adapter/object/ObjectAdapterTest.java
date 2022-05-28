package com.augtsy.pattern.adapter.object;

import com.augtsy.pattern.adapter.clazz.Adapter;
import com.augtsy.pattern.adapter.clazz.TargetAble;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:11 上午
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {

        Source source = new Source();
        ObjectAdapter target = new ObjectAdapter(source);
        target.editTextFile();
        target.editWordFile();
    }

}
