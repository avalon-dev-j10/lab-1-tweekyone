package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

public class Person {
    
    Passport passport;
    Address fullAddress;
    
    //конструкторы класса Person, инициализирующий Passport и Address
    public Person(String name, String surname, String otchestvo) {
        passport = new Passport(name, surname, otchestvo);
        fullAddress = new Address();
    }
    
    //Возвращаем имя человека
    public String getFullName() {
        String name = passport.getName();
        String surname = passport.getSurname();
        String otchestvo = passport.getOtchestvo();
        String secName = passport.getSecName();
        char[] firstLetter = secName.toCharArray();  //первая буква второго имени
        
        if (name != "" && surname!= "" && otchestvo != "") {
            return name + " " + surname + " " + otchestvo;
        } else if (otchestvo == "" && secName != "") {
            return name + " " + firstLetter[0] + ". " + surname;
        } else if (otchestvo == "" && secName == "" && name != "" && 
                surname == ""){
            return name + " " + surname;
        } return null;
    }

    //Возвращаем адрес
    public String getAddress() {
        String address = fullAddress.getAddress();
        return address;
    }
}