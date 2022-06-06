package com.augtsy.pattern.responsibility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/10:20 上午
 */
public class AuthHandler extends AbstractHandler implements Handler {

    private final static Log logger = LogFactory.getLog(AuthHandler.class);

    private final String name;

    public AuthHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        logger.info(name);
        logger.info("AuthHandler info...");
        Handler handler = getHandler();
        if (handler != null) {
            handler.operator();
        }
    }
}
