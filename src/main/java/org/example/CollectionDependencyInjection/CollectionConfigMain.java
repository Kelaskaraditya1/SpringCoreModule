package org.example.CollectionDependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionConfigMain {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("org/example/CollectionDependencyInjection/CollectionConfig.xml");
        Employee employee = (Employee) context.getBean("Aditya");
        Employee.getDetails(employee);

    }
}
