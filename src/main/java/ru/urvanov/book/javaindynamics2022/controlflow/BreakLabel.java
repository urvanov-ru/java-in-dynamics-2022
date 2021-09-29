package ru.urvanov.book.javaindynamics2022.controlflow;

/**
 * Пример break с меткой для внешнего цикла
 */
public class BreakLabel {
    public static void main(String[] args) {
        // метка для внешнего цикла.
        outer_for:
        for (int n = 0; n < 10; n++) {
            //...
            // метка для внутреннего цикла
            inner_for:
            for (int m = 0; m < 10; m++) {

                // прерываем внешний цикл для n == 2 и m ==4
                if ((n == 9) && (m == 4)) break outer_for;

                // прерываем внутренний цикл для n == 7 и m == 2
                if ((n == 7) && (m == 2)) break;

                // можно прервать внутренний цикл и по метке.
                if ((n == 9) && (m % 2 == 1)) break inner_for;

                System.out.println("n=" + n + "; m=" + m);
            }
        }
    }
}
