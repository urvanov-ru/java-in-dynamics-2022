package ru.urvanov.javaindynamics2022.io;

import java.util.Scanner;

/**
 * Пример использования Scanner
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int i = sc.nextInt();
        System.out.println("Введите дробное число");
        double d = sc.nextDouble();
        // System.out - это PrintStream
        // Мы используем метод format, в качестве первого
        // аргумента передаётся строка, содержащая специальные
        // символы форматирования.
        // %d - вывод десятичного целого числа
        // %f - вывод числа с плавающей точкой. Мы дополнительно указываем,
        // что нужно вывести 10 символов до запятой и 2 символа после запятой
        System.out.format("i = %d, d = %10.2f", i, d);
    }
}
