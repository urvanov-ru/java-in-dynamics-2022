package ru.urvanov.book.javaindynamics2022.controlflow;

/**
 * Оператор continue с меткой.
 */
public class ContinueLabel {
    public static void main(String[] args) {
        outer_label:
        for (int n = 4; n <= 9; n++) {
            int m = 3;
            while (m <= 5) {
                // Если остаток от деления n на m равен 0,
                // то переходим к следующей итерации
                // цикла outer_label
                if (n % m == 0) continue outer_label;
                System.out.println("n=" + n + "; m=" + m);
                m++;
            }
        }
    }
}
