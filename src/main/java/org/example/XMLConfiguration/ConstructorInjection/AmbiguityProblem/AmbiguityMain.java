package org.example.XMLConfiguration.ConstructorInjection.AmbiguityProblem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityMain {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("org/example/XMLConfiguration/ConstructorInjection/AmbiguityProblem/AmbiguityConfig.xml");
        Addition addition = (Addition) context.getBean("Addition");
        addition.getSum();
    }
}
