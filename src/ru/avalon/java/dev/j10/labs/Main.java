package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {
    public static void main (String args[]){
        //создание экземпляров имен
        Person ivanov = new Person("Иванов","Иван","Иванович");
        Person smith = new Person("John","Edvard","Smith");
        
        //создание экземпляров адресов
        ivanov.setAddress("Россия", "Санкт-Петербург", "Ленина", 17, 9);
        smith.setAddress("USA", "Los Angeles", "Lenina", 3, 12);

        //создание строковых переменных
        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        String ivanovAddress = ivanov.getAddress();
        String smithAddress = smith.getAddress();
        
        //Вывод строковых переменных в консоль
        System.out.println(ivanovFullName);
        System.out.println(smithFullName);    
        System.out.println(ivanovAddress);
        System.out.println(smithAddress);
    } 
}
