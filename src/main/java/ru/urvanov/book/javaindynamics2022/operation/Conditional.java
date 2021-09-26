package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Операции сравнения
 */
public class Conditional {
    public static void main(String[] args) {
        int x = 3;
        double d = 3.1;
        System.out.println(x == d); // false
        System.out.println(x > d);  // false
        System.out.println(x < d);  // true
    }
}
