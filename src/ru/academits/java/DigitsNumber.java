package ru.academits.java;

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = Math.abs(console.nextInt());
        System.out.println("Сумма всех цифр числа:" + digitSum(number));
        System.out.println("Сумма нечетных цифр числа:" + oddDigitSum(number));
        System.out.println("Максимальное число:" + maxDigit(number));
    }

    public static int digitSum(int number) {
        int sum = 0;
        for (; number > 0; number /= 10)
            sum += number % 10;
        return sum;
    }

    public static int oddDigitSum(int number) {
        int oddSum = 0;
        for (; number > 0; number /= 10)
            if ((number % 10) % 2 != 0) {
                oddSum += (number % 10);
            }
        return oddSum;
    }

    public static int maxDigit(int number) {
        int maxDigit = Integer.MIN_VALUE;
        for (; number > 0; number /= 10)
            if ((number % 10) > maxDigit) {
                maxDigit = (number % 10);
            }
        return maxDigit;
    }
}