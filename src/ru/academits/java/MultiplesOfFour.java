package ru.academits.java;

public class MultiplesOfFour {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (isMultipleOfFour(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isMultipleOfFour(int number) {
        return (number % 4 == 0);
    }
}