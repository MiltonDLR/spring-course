package com.milton.spring.springadvanced.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjectionannotationsconfig.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
    }
}
