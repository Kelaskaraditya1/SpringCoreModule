package org.example.SpringBeanLifeCycle.UsingAnnotationConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
    private int math,physics,chemistry;

    public Subject(int math,int physics,int chemistry){
        this.math=math;
        this.physics=physics;
        this.chemistry=chemistry;
    }

    public Subject(){

    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    @PostConstruct
    public void giveExam(){
        System.out.println("Exam is Conducted Successfully");
    }

    @PreDestroy
    public void getResult(){
        System.out.println("The Marks in Math are:"+this.getMath());
        System.out.println("The Marks in Physics are:"+this.getPhysics());
        System.out.println("The Marks in Chemistry are:"+this.getChemistry());
    }
}
