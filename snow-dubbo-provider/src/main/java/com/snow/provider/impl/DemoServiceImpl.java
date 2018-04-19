package com.snow.provider.impl;

import com.snow.provider.service.DemoService;
import org.springframework.util.StringUtils;

/**
 * Created by Leo. on 2018/4/18.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println(name.concat(", Hello World!"));
        return "success";
    }
}
