package ru.academits.java.OOP;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Petr", "Petrovich", "Petrov", 32);

        int BirthYear = Person.calculateBirthYear(person.getAge(), currentYear);

        System.out.println("Год рождения пользователя: " + BirthYear);
    }
}