package org.example.CollectionDependencyInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phoneNo;
    private Set<String> address;
    private Map<String,String> courses;

    public Employee(String name,List<String> phoneNo,Set<String> address,Map<String,String> courses){
        this.name=name;
        this.address=address;
        this.phoneNo=phoneNo;
        this.courses=courses;
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<String> phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public static void getDetails(Employee employee){
        System.out.println("The Name of the Employee is:"+employee.getName());
        System.out.println();
        System.out.println("The List of PhoneNo that employee has:");
        employee.getPhoneNo().stream().forEach(value->{
            System.out.print(value+" ");
        });
        System.out.println();
        System.out.println("The Addresses of the Employee are:");
        employee.getAddress().stream().forEach(value->{
            System.out.print(value+" ");
        });
        System.out.println();
        System.out.println("The Employee has been registered for these courses:");
        for (var tuple:employee.getCourses().entrySet()){
            System.out.println("Course:"+tuple.getKey()+" "+"Duration:"+tuple.getValue());
        }
        System.out.println();
    }
}
