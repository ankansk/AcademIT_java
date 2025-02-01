package ru.academits.java;

import java.util.Scanner;

public class DatesOfNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = console.nextInt();
        System.out.println("Сумма всех цифр числа:" + sumOfNumbers(number));
        System.out.println("Сумма нечетных цифр числа:" + sumOfOddNumbers(number));
        System.out.println("Максимальное число:" + MaxDigit(number));
    }

    public static int sumOfNumbers(int number) {
        int sum = 0;
        for (; number > 0; number /= 10)
            sum += number % 10;
        return sum;
    }

    public static int sumOfOddNumbers(int number) {
        int oddSum = 0;
        for (; number > 0; number /= 10)
            if ((number % 10) % 2 != 0) {
                oddSum += (number % 10);
            }
        return oddSum;
    }

    public static int MaxDigit(int number) {
        int maxDigit = Integer.MIN_VALUE;
        for (; number > 0; number /= 10)
            if ((number % 10) > maxDigit) {
                maxDigit = (number % 10);
            }
        return maxDigit;
    }
}