package org.example.XMLConfiguration.ConstructorInjection;

import jdk.jshell.EvalException;

import java.security.cert.Certificate;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private CourseCertificate courseCertificate;
    private List<String> coursesList;

    public Person(String name, int age,CourseCertificate courseCertificate,List<String> coursesList){
        this.name=name;
        this.age=age;
        this.courseCertificate=courseCertificate;
        this.coursesList=coursesList;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "The name of the Person is:"+this.name+".\n The age of the person is:"+this.age+"\n "+this.getName()+" has recently has got "+this.getCourseCertificate().getCertificateName()
                +" \n and the Certificate Number is:"+this.getCourseCertificate().getCertificateNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CourseCertificate getCourseCertificate() {
        return courseCertificate;
    }

    public void setCourseCertificate(CourseCertificate courseCertificate) {
        this.courseCertificate = courseCertificate;
    }

    public List<String> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<String> coursesList) {
        this.coursesList = coursesList;
    }

    public void getCertificateDetails(){
        this.getCoursesList().stream().forEach(value->{
            System.out.println(value);
        });
    }
}
