package com.milton.spring.springcore1.placeholderassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("assignmentdaoconfig.xml");
        AssignmentDAO assignmentDAO = (AssignmentDAO) context.getBean("assignmentDAO");
        System.out.println(assignmentDAO);
    }
}
