package ru.urvanov.javaindynamics2022.controlflow;

/**
 * Пример с continue
 */
public class Continue {
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            if (n % 2 == 0) continue;
            System.out.println(n);
        }
    }
}
