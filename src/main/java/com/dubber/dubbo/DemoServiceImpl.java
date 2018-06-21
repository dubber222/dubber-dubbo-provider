package com.dubber.dubbo;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created on 2018/6/21.
 *
 * @author dubber
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String msg) {
        return "hello " + msg;
    }

    @Override
    public String saySeeYou(String msg) {
        return "see you " + msg;
    }
}
