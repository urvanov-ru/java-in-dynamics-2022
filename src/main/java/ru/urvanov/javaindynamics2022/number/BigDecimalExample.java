package ru.urvanov.javaindynamics2022.number;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Пример использования BigDecimal
 */
public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("100.01");

        // 4 значащие цифры
        // Стандартное округление, которому учат в школе.
        MathContext mathContext = new MathContext(4, RoundingMode.HALF_UP);

        BigDecimal result1 = value1.add(new BigDecimal("2"), mathContext)
                .subtract(new BigDecimal("0.001"), mathContext);

        System.out.println(result1); // 102.0 (4 значащие цифра, как в mathContext.

        BigDecimal result2 = value1.add(new BigDecimal("2"))
                .subtract(new BigDecimal("0.001"));

        System.out.println(result2); // 102.009 (scale=3, так как это максимальный
        // который задался в операции subtract
    }
}
