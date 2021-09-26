package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Отличие постфиксного и префиксного инкремента и декремента
 */
public class PostfixPrefixDifference {
    public static void main(String[] args) {
        int x1 = 100;
        int x2 = 145;

        int y1 = ++x1;
        int y2 = --x2;

        // Вывод для префиксных операций
        System.out.println("\nPrefix ++, -- test");
        System.out.println("x1=" + x1 + "; y1=" + y1);
        System.out.println("x2=" + x2 + "; y2=" + y2);

        // Возвращаем исходные значения
        x1 = 100;
        x2 = 145;

        int z1 = x1--;
        int z2 = x2++;

        // Вывод для постфиксных операций
        System.out.println("\nPostfix ++, -- test");
        System.out.println("x1=" + x1 + "; z1=" + z1);
        System.out.println("x2=" + x2 + "; z2=" + z2);
    }
}
