package org.example.SpringBeanLifeCycle.UsingAnnotationConfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SubjectMain {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/example/SpringBeanLifeCycle/UsingAnnotationConfiguration/SubjectConfiguration.xml");
        Subject subject = (Subject) context.getBean("Aditya");
        context.registerShutdownHook();
    }
}
