package org.example.XMLConfiguration.PrimitiveDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("I am Ironman");
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/XMLConfiguration/PrimitiveDependencyInjection/PrimitiveConfig.xml");

        // Data From Bean 1
        Student student1 = (Student) context.getBean("Aditya");
        Student.printDetails(student1);

        // Data from Bean 2
        Student student2 = (Student) context.getBean("Mayur");
        Student.printDetails(student2);
    }
}
