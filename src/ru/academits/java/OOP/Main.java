package ru.academits.java.OOP;

import java.time.Year;

public class Main {
    public static void main(String[] args) {

        int age = 32;

        Person person = new Person(age);

        int currentYear = Year.now().getValue();
        int BirthYear = Person.calculateBirthYear(person.getAge(), currentYear);

        System.out.println("Год рождения пользователя: " + BirthYear);
    }
}