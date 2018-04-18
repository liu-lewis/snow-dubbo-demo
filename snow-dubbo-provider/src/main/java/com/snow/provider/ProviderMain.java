package com.snow.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] {"spring/applicationProvider.xml"});
        context.start();

        System.out.println("服务注册成功..");
        System.in.read();
        context.close();
    }
}