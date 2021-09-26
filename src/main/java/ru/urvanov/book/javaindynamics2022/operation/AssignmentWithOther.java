package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Присвоение с выполнением другой операции
 */
public class AssignmentWithOther {

    public static void main(String[] args) {
        int x1 = 100;
        byte x2 = 100;
        int x3 = 100;

        x1 += 300; // эквивалентно x1 = (int) x1 + 300;
        x2 += 300; // эквивалентно x2 = (byte) x2 + 300;
        x3 += 300.1; // эквивалентно x3 = (int) x3 + 300.1;

        System.out.println("x1=" + x1);  // 400
        System.out.println("x2=" + x2);  // -112
        System.out.println("x3=" + x3);  // 400
    }
}
