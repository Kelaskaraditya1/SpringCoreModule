package org.example.AutoWiring.UsingAnnotationConfiguration;

public class Address {

    private String country,state,city;

    public Address(String country,String state,String city){
        this.country=country;
        this.state=state;
        this.city=city;
    }

    public Address(){

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Country:"+this.getCountry()+"\nState:"+this.getState()+"\nCity:"+this.getCity();
    }
}
