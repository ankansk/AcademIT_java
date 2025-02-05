package ru.academits.java.OOP;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ivan", "Ivanovich", "Ivanov", 30);

        int BirthYear = Person.calculateBirthYear();

        System.out.println("Год рождения пользователя: " + BirthYear);
    }
}