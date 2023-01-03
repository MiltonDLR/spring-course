package com.milton.spring.springcore1.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    @PostConstruct
    public void initialize(){
        System.out.println("Inside Initialize");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("CleanUp Method");
    }
}
