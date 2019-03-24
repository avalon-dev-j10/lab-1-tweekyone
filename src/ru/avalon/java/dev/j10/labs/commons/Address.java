package ru.avalon.java.dev.j10.labs.commons;

public class Address{
    // атрибуты класса- адрес
    private String country = "Россия";
    private String city = "Санкт-Петербург";
    private String street = "Пушкина";
    private int hNo = 18;
    private int aNo = 5;
    
    // публичные сеттеры адреса
    
    // методы класса
    // полный адрес 
    public String getAddress(){
        return "Адрес регистрации: " + country + ", " + city + ", " + street + 
                ", " + hNo + ", " + aNo + ".";
    }
}