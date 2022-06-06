package com.augtsy.pattern.responsibility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/10:23 上午
 */
public class BusinessHandler extends AbstractHandler implements Handler {

    private final static Log logger = LogFactory.getLog(BusinessHandler.class);

    private String name;

    public BusinessHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        logger.info("BusinessHandler info...");
        Handler handler = getHandler();
        if (handler != null) {
            handler.operator();
        }
    }
}
