package ru.urvanov.javaindynamics2022.formatparse;

import java.util.Scanner;

public class ScannerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ожидаем ввод с консоли сначала числа,
        // а затем вещественного числа
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
    }
}
