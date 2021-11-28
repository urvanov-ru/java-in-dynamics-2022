package ru.urvanov.javaindynamics2022.controlflow;

/**
 * Примеры DoWhile
 */
public class DoWhile {
    public static void main(String[] args) {
        // вывод чисел от 0 до 10
        int x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        // Условие ложно изначально,
        // но выведется 0, так как
        // сначала будет выполняться
        // блок операторов, а лишь затем
        // проверяться условие
        x = 0;
        do {
            System.out.println(x);
            x++;
        } while (x < 0);
    }
}
