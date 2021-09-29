package ru.urvanov.book.javaindynamics2022.controlflow;

/**
 * Примеры циклов For.
 */
public class For {
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.println(n);
        }
        for (int n = 0, m = 3; n <= 10; n++, m--) {
            System.out.println("n=" + n + "; m=" + m);
        }
        int[] myarray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int n : myarray) {
            System.out.println(n);
        }
    }
}
