package com.dubbo.provider.service.impl;
import com.dubbo.provider.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/21.
 */
public class DemoServiceImpl implements DemoService {
    public void test() {
        System.out.print("this is a demoService");
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mvc.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}

