package com.milton.spring.springadvanced.standalone.collections;

import com.milton.spring.springadvanced.autowiring.annotations.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("productslistconfig.xml");
        ProductsList productsList = (ProductsList) context.getBean("productsList");
        System.out.println(productsList);
    }
}
