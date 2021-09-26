package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Пример тернарной операции
 */
public class Ternary {
    public static void main(String[] args) {
        int x = 255 > 34 ? 10 : -22; // 10
        String str1 = 44 == 66 ? "YES": "NO"; //"NO"
        System.out.println(x);
        System.out.println(str1);
    }
}
