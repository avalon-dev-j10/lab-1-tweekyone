package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    // атрибуты класса- адрес
    private String country;
    private String city;
    private String street;
    private int hNo;
    private int aNo;
    
    // публичные сеттеры адреса
    public Address(String country, String city, String street, int hNo, int aNo){
        this.country = country;
        this.city = city;
        this. street = street;
        this.hNo = hNo;
        this.aNo = aNo;
    }
    
    // методы класса
    // полный адрес 
    public String getAddress(){
        return "Адрес регистрации: " + country + ", " + city + ", " + street + 
                ", " + hNo + ", " + aNo + ".";
    }
}