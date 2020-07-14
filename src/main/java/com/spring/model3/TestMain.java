package com.spring.model3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("model3.xml");
       Animal1 animal1= context.getBean("animal11",Animal1.class);
       animal1.disp();
    }
}
