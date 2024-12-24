package org.example.SpringBeanLifeCycle.UsingInterfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ToyMain {
    public static void main(String[] args) {

        // for executing Destroy using registerShutdownHook() from AbstractApplicationContext

        var context = new ClassPathXmlApplicationContext("org/example/SpringBeanLifeCycle/UsingInterfaces/ToyXMLConfiguration.xml");
        Toy optimusPrime = (Toy) context.getBean("OptimusPrime");
        context.registerShutdownHook();
        System.out.println(optimusPrime);
    }
}
