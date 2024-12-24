package org.example.AutoWiring.UsingXMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {

        var context =new ClassPathXmlApplicationContext("org/example/AutoWiring/UsingXMLConfiguration/AutoWiringXMLConfiguration.xml");
        Employee employee = context.getBean("Aditya",Employee.class);
        System.out.println(employee);
    }
}
