package com.milton.spring.springcore1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springcore1Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " +emp.getName());
        //SpringApplication.run(Springcore1Application.class, args);
    }

}
