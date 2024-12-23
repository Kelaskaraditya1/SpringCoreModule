package org.example.XMLConfiguration.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("org/example/XMLConfiguration/ConstructorInjection/ConstructorConfig.xml");
        Person person = (Person) context.getBean("PersonConstructor");
        System.out.println(person.toString());

        person.getCertificateDetails();
    }
}
