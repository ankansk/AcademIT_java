package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите начальное число диапазона, например 3");
        int start = console.nextInt();
        while (start <= 1) {
            System.out.println("Введите число > 1");
            start = console.nextInt();
        }
        System.out.println("Введите конечное число диапазона, например 17");
        int end = console.nextInt();
        while (start > end) {
            System.out.println("Конченое значение должно быть больше начального");
            end = console.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            count++;
        }
        double average = (double) sum / count;
        System.out.printf("Среднее арифметическое чисел диапазона = %.2f%n", average);
    }
}
