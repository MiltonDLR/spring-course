package com.milton.spring.springcore1.lc.assignment;


        import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
        import org.springframework.context.support.AbstractApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcassignmentconfig.xml");
        TicketReservation ticket = (TicketReservation) context.getBean("ticket");
        System.out.println(ticket);
        context.registerShutdownHook();

    }
}
