package org.example.XMLConfiguration.ReferenceDependencyInjection;

public class SecondClass {
    private int y;
    private FirstClass firstClass;

    public SecondClass(int y, FirstClass firstClass){
        this.y=y;
        this.firstClass=firstClass;
    }
    public SecondClass(){

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public FirstClass getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }
    public void getTable3(){
        for(int i=1;i<=10;i++){
            System.out.println("3 * "+i+" = "+3*i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
