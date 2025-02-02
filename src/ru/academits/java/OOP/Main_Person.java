package ru.academits.java.OOP;

public class Main_Person {

    public static void main(String[] args) {

        String name = "Petr";
        String middleName = "Petrovich";
        String familyName = "Petrov";
        int age = 32;

        Person person = new Person(name, middleName, familyName);
        Person person1 = new Person(age);

        person.printNameAndAge();
        person.setName("Ivan");
        person.setMiddleName("Ivanovich");
        person.setFamilyName("Ivanov");
        person.setAge(40);
        person.printNameAndAge();
    }
}