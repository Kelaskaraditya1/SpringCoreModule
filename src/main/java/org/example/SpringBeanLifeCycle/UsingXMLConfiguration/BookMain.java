package org.example.SpringBeanLifeCycle.UsingXMLConfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) {

//        var context = new ClassPathXmlApplicationContext("org/example/SpringBeanLifeCycle/UsingXMLConfiguration/BookXMLConfiguration.xml");

        /*  It can calculate init method just using XML Configuration
            but for calling destroy method we have to use context.registerShutdownHook() which notifys about destroy method
            for using this method we have to create Refrence of AbstractApplicationContext

        * */

        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("org/example/SpringBeanLifeCycle/UsingXMLConfiguration/BookXMLConfiguration.xml");
        Book book = (Book) context1.getBean("AtomicHabits");
        System.out.println(book);
        context1.registerShutdownHook();
    }
}
