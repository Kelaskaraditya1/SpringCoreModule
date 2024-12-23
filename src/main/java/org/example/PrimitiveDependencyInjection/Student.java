package org.example.PrimitiveDependencyInjection;


public class Student {
    private String sid;
    private String name;
    private int rollNo;
    private String department;

    public Student(String sid,String name,int rollNo,String department){
        this.sid=sid;
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(String name, int rollNo, String department){
        this.name=name;
        this.rollNo=rollNo;
        this.department=department;
    }
    public Student(){

    }

    public static void printDetails(Student student){
        System.out.println("The Sid of the Student is:"+student.getSid());
        System.out.println("The Name of the Student is:"+student.getName());
        System.out.println("The RollNo of the Student is:"+student.getRollNo());
        System.out.println("The Department of the Student is:"+student.getDepartment());
        System.out.println();
    }
}
