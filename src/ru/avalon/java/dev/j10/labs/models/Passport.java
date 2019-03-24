package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

public class Passport {
    //параметры не заданы
    private String serialNo; 
    private String name;
    private String surname;
    private String otchestvo;
    private String secName = "Bunny"; //Что бы работал getFullName в Person
    private String bDay;
    private String date;
    private String liver; //орган, выдавший пасспорт
    
    public Passport(String name, String surname, String otchestvo) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }
    
    public String getName(){
        return name;
    }
    
     public String getSurname(){
        return surname;
    } 
     
    public String getOtchestvo(){
        return otchestvo;
    }   
    
    public String getSecName(){
        return secName;
    }   
  
}
