package ru.academits.java.OOP;

import java.util.Scanner;

public class Main_Person {

    public static void main(String[] args) {

        String name = "Petr";
        String middleName = "Petrovich";
        String familyName = "Petrov";
        int age = 32;

        Person person = new Person(name, middleName, familyName, age);

        person.printNameAndAge();
        person.setName("Ivan");
        person.setMiddleName("Ivanovich");
        person.setFamilyName("Ivanov");
        person.setAge(35);
        person.printNameAndAge();

        Scanner console = new Scanner(System.in);
        System.out.println("Введите текущий год");
        int currentYear = console.nextInt();
        int age1 = person.getAge();
        System.out.println("Год рождения пользователя: " + Person.calculateBirthYear(age1, currentYear));
    }
}