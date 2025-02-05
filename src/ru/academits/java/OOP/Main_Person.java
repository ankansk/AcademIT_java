package ru.academits.java.OOP;

public class Main_Person {

    public static void main(String[] args) {

        String name = "Petr";
        String middleName = "Petrovich";
        String familyName = "Petrov";
        int age = 30;

        Person person = new Person(name, middleName, familyName, age);

        person.printFullName();
        person.setName("Ivan");
        person.setMiddleName("Ivanovich");
        person.setFamilyName("Ivanov");
        person.printFullName();
    }
}