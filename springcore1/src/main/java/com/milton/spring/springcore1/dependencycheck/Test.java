package com.milton.spring.springcore1.dependencycheck;


import com.milton.spring.springcore1.lc.annotations.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("prescriptionconfig.xml");
        Prescription prescription = (Prescription) context.getBean("prescription");
        System.out.println(prescription);
    }
}
