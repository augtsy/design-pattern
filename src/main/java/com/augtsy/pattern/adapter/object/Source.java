package com.augtsy.pattern.adapter.object;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:05 上午
 */
public class Source {

    private final static Log logger= LogFactory.getLog(Source.class) ;

    public void editTextFile() {//text 文件编辑
        logger.info("a text file editing");
    }
}
