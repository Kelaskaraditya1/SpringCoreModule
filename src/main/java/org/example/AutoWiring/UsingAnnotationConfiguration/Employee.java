package org.example.AutoWiring.UsingAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String name;
    private int empId;
    private Address address;

    public Employee(String name,int empId,Address address){
        this.name=name;
        this.empId=empId;
        this.address=address;
    }

    public Employee(String name,Address address){
        this.name=name;
        this.address=address;
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "The Name of the Employee is:"+this.getName()+"\nThe Emp id of the Employee is:"+this.getEmpId()+"\nThe Address of the Employee is:"+"\n"+this.getAddress();
    }
}
