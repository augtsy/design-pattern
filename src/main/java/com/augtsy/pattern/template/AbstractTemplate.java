package com.augtsy.pattern.template;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/1:57 下午
 */
public abstract class AbstractTemplate {

    private final static Log logger = LogFactory.getLog(AbstractTemplate.class);

    /**
     * 模板方法，用于核心流程和算法的定义
     */
    public void templateMethod() {
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }

    private void checkNumber() {
        logger.info("抽号。。。。。。");
    }

    private void queueUp() {
        logger.info("排队。。。。。。");
    }

    public abstract void handleBusiness();

    private void serviceEvaluation() {
        logger.info("business finished, servic evaluation .. . . . .");
    }

}
