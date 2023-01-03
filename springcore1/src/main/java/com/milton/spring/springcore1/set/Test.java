package com.milton.spring.springcore1.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer carDealer = (CarDealer) context.getBean("carDealer");
        System.out.println(carDealer.getName());
        System.out.println(carDealer.getModels());
    }
}
