package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        A a=context.getBean("a",A.class);
        System.out.println(a);
        a.disp();
    }
}
