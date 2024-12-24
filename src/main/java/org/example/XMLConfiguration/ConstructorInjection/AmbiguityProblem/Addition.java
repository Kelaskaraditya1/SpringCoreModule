package org.example.XMLConfiguration.ConstructorInjection.AmbiguityProblem;

public class Addition {

    private int a,b;

    public Addition(double a,double b){
        this.a=(int)a;
        this.b=(int)b;
        System.out.println("This is constructor which takes Double as a parameter");
    }

    public Addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("This is constructor which takes Integer as a parameter");
    }

//    public Addition(String a,String b){
//        this.a=Integer.parseInt(a);
//        this.b=Integer.parseInt(b);
//        System.out.println("This is constructor which takes String as a parameter");
//    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getSum(){
        System.out.println("The value of a is:"+this.a);
        System.out.println("The value of b is:"+this.b);
        System.out.println("The Sum of a and b is;"+(this.a+this.b));
    }
}
