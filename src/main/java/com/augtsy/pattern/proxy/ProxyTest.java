package com.augtsy.pattern.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Auther: tsy
 * @Date: 2022/05/28/2:24 下午
 */
public class ProxyTest {

    public static void main(String[] args) {
        Company company = new Proxy();
        company.findWorker("Java");
    }

}
