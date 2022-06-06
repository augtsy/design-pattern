package com.augtsy.pattern.template;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/2:01 下午
 */
public class TakeMoney extends AbstractTemplate {

    private final static Log logger = LogFactory.getLog(TakeMoney.class);

    @Override
    public void handleBusiness() {
        logger.info("TakeMoney......");
    }
}
