package org.example.ReferenceDependencyInjection;

public class FirstClass {
    private int x;
    public FirstClass(int x){
        this.x=x;
    }
    public FirstClass(){

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void getTable2(){
        for(int i=1;i<=10;i++){
            System.out.println("2 * "+i+" = "+2*i);
            try{
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
