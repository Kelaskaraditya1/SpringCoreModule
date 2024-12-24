package org.example.SpringBeanLifeCycle.UsingXMLConfiguration;

public class Book {

    private String name;
    private String genre;
    private double price;

    public Book(String name,String genre,double price){
        this.name=name;
        this.genre=genre;
        this.price=price;
    }

    public Book(String name,String genre){
        this.name=name;
        this.genre=genre;
    }

    public Book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void init(){
        for(int i=1;i<=10;i++){
            System.out.println("2 * "+i+" = "+2*i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void destroy(){
        for(int i=1;i<=10;i++){
            System.out.println("3 * "+i+" = "+3*i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "The Name of the Book is:"+this.getName()+"\nThe Genre of the Book:"+this.getGenre()+"\nThe Price of the Book is:"+this.getPrice();
    }
}
