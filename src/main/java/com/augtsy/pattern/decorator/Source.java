package com.augtsy.pattern.decorator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/2:13 下午
 */
public class Source implements SourceAble {

    private final static Log logger = LogFactory.getLog(Source.class);

    @Override
    public void createComputer() {
        logger.info(" create computer by Source ");
    }
}
