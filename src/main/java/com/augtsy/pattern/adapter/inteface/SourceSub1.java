package com.augtsy.pattern.adapter.inteface;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:34 上午
 */
public class SourceSub1 extends AbstractAdapter {

    private final static Log logger = LogFactory.getLog(SourceSub1.class);

    @Override
    public void editTextFile() {
        logger.info(" a text file editing");
    }
}
