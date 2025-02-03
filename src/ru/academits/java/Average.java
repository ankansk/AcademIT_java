package ru.academits.java;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите начальное число диапазона");
        int start = console.nextInt();
        while (start <= 1) {
            System.out.println("Введите число > 1");
            start = console.nextInt();
        }
        System.out.println("Введите конечное число диапазона");
        int end = console.nextInt();
        while (start > end) {
            System.out.println("Конечное число должно быть больше начального");
            end = console.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            count++;
        }
        double average = (double) sum / count;
        System.out.printf("Среднее арифметическое всех чисел диапазона = %.2f%n", average);

        int evenSum = 0;
        int evenCount = 0;
        for (int i = start; i <= end; i++)
            if (i % 2 == 0) {
                evenSum = evenSum + i;
                evenCount++;
            }
        double evenAverage = (double) evenSum / evenCount;
        System.out.printf("Среднее арифметическое четных чисел диапазона = %.2f%n", evenAverage);
    }
}