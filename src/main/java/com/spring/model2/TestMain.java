package com.spring.model2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("model2.xml");
        Animal factory = context.getBean("animal", Animal.class);
        factory.disp();
    }
}
