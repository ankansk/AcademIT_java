package ru.academits.java.OOP;

import java.util.Scanner;

public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.isEmpty())) {
            this.name = name;
            System.out.println("Имя было изменено");
        } else {
            System.out.println("Имя не было изменено");
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (!(middleName.isEmpty())) {
            this.middleName = middleName;
            System.out.println("Отчество было изменено");
        } else {
            System.out.println("Отчество не было изменено");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.isEmpty())) {
            this.familyName = familyName;
            System.out.println("Фамилия была изменена");
        } else {
            System.out.println("Фамилия не была изменена");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " + middleName + ", возраст: " + age;
    }

    public void printNameAndAge() {
        System.out.println("Новый пользователь: " + toString());
    }

    public static int calculateBirthYear(int age, int currentYear) {
        return currentYear - age;
    }
}