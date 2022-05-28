package com.augtsy.pattern.adapter.clazz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:09 上午
 */
public class Adapter extends Source implements TargetAble {

    private final static Log logger = LogFactory.getLog(Adapter.class);

    @Override
    public void editWordFile() {
        logger.info("a word file editing");
    }
}
