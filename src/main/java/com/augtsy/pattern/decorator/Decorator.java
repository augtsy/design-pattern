package com.augtsy.pattern.decorator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/2:14 下午
 */
public class Decorator implements SourceAble {

    private final SourceAble source;
    private final static Log logger = LogFactory.getLog(Decorator.class);

    public Decorator(SourceAble source) {
        super();
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        //在创建完电脑后给电脑装上系统
        logger.info("make system.....");
    }
}
