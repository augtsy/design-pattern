package com.augtsy.pattern.adapter.inteface;

import com.augtsy.pattern.adapter.object.ObjectAdapter;
import com.augtsy.pattern.adapter.object.Source;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:11 上午
 */
public class IntefaceAdapterTest {

    public static void main(String[] args) {
        SourceAble source1 = new SourceSub1();
        SourceAble source2 = new SourceSub2();
        source1.editTextFile();
        source2.editWordFile();
    }

}
