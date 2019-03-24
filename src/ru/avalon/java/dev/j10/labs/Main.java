package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {
    public static void main (String args[]){
        //создание экземпляров имен
        Person ivanov = new Person("Иванов","Иван","Иванович");
        Person smith = new Person("John","Edvard","Smith");

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
