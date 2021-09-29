package ru.urvanov.book.javaindynamics2022.controlflow;

/**
 * Примеры прерывания циклов с помощью break
 */
public class Break {
    public static void main(String[] args) {
        int n1 = 0;
        while (true) {
            System.out.println(n1);
            if (n1 == 10) break;
            n1++;
        }

        int n2 = 0;
        do {
            System.out.println(n2);
            if (n2 == 10) break;
            n2++;
        } while (true);

        for (int n3 = 0; ;) {
            System.out.println(n3);
            if (n3 == 10) break;
            n3++;
        }
    }
}
