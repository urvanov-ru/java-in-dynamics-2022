package ru.urvanov.javaindynamics2022.operation;

/**
 * Примеры унарных операций
 */
public class Unary {

    public static void main(String[] args) {

        int x = 3;
        short y = 100;
        x++; // после выполнения x становится равным 4.
        y--; // после выполнения y становится равным 99.



        int x1 = +10; // положительная десятка
        int x2 = -x1; // -10

        boolean b1 = true;
        boolean b2 = !b1; // false

        ++x1; // теперь x1 равен 11.
        --x2; // теперь x2 равен -11
    }
}
