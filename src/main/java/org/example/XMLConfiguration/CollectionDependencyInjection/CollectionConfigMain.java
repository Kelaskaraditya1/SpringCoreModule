package org.example.XMLConfiguration.CollectionDependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionConfigMain {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("org/example/XMLConfiguration/CollectionDependencyInjection/CollectionConfig.xml");
        Employee employee = (Employee) context.getBean("Aditya");
        Employee.getDetails(employee);

    }
}
