package com.milton.spring.springcore1.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesconfig.xml");
        CountriesAndLanguages countryAndLanguage = (CountriesAndLanguages) context.getBean("countriesAndLanguages");
        System.out.println(countryAndLanguage);
    }
}
