package com.augtsy.pattern.responsibility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/10:29 上午
 */
public class ResponseHandler extends AbstractHandler implements Handler {

    private final static Log logger = LogFactory.getLog(BusinessHandler.class);

    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        logger.info("ResponseHandler info...");
        Handler handler = getHandler();
        if (handler != null) {
            handler.operator();
        }
    }
}
