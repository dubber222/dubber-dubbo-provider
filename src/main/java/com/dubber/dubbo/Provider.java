package com.dubber.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created on 2018/6/21.
 *
 * @author dubber
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
