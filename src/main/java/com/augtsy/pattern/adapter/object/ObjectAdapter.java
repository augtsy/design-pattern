package com.augtsy.pattern.adapter.object;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/11:21 上午
 */
public class ObjectAdapter implements TargetAble {

    private final static Log logger = LogFactory.getLog(ObjectAdapter.class);

    private final Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void editTextFile() {
        this.source.editTextFile();
    }

    @Override
    public void editWordFile() {
        logger.info("a word file ed ting ");
    }
}
