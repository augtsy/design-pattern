package com.augtsy.pattern.responsibility;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/10:19 上午
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
