package com.augtsy.pattern.responsibility;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/06/06/10:31 上午
 */
public class HandlerTest {

    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("authHandler");
        BusinessHandler businessHandler = new BusinessHandler("businessHandler");
        ResponseHandler responseHandler = new ResponseHandler("responseHandler");
        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);
        authHandler.operator();
    }

}
