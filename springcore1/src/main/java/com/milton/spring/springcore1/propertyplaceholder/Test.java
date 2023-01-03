package com.milton.spring.springcore1.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mydaoconfig.xml");
        MyDAO dao = (MyDAO) context.getBean("myDAO");
        System.out.println(dao);
    }
}
