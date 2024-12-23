package org.example.ReferenceDependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceMain {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("org/example/ReferenceDependencyInjection/ReferenceConfig.xml");

        // First Class Bean

//        FirstClass firstClass = (FirstClass) context.getBean("FirstClassBean") ;
//        System.out.println(firstClass.getX());
//        firstClass.getTable2();

        // Second Class Bean

        SecondClass secondClass =(SecondClass) context.getBean("SecondClassBean");
        System.out.println(secondClass.getY());
        secondClass.getTable3();
    }
}
