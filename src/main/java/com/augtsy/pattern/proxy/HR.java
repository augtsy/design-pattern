package com.augtsy.pattern.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.ws.handler.LogicalHandler;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/2:22 下午
 */
public class HR implements Company {

    private final static Log logger = LogFactory.getLog(HR.class);

    @Override
    public void findWorker(String title) {
        logger.info(" i need find a worker , title is " + title);
    }
}
