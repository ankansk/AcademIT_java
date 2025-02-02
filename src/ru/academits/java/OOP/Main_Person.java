package ru.academits.java.OOP;

public class Main_Person {

    public static void main(String[] args) {

        String name = "Petr";
        String middleName = "Petrovich";
        String familyName = "Petrov";

        Person person = new Person(name, middleName, familyName);

        person.printFullName();
        person.setName("Ivan");
        person.setMiddleName("Ivanovich");
        person.setFamilyName("Ivanov");
        person.printFullName();
    }
}