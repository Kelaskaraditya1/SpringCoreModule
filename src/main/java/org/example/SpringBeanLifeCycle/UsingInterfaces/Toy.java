package org.example.SpringBeanLifeCycle.UsingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Toy implements InitializingBean, DisposableBean {

    private String name;
    private double price;

    public Toy(String name,double price){
        this.name=name;
        this.price=price;
    }

    public Toy(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "The name of the Toy is:"+this.getName()+"\nThe Price of the Toy is:"+this.getPrice();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Khapli");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean has Started");
    }
}
