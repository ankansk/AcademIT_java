package ru.academits.java.OOP;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(39);

        int BirthYear = Person.calculateBirthYear(person.getAge());

        System.out.println("Год рождения пользователя: " + BirthYear);
    }
}