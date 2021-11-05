package ru.urvanov.javaindynamics2022.number;

import java.math.BigInteger;

/**
 * Пример использования BigInteger
 */
public class BigIntegerExample {
    public static void main(String[] args) {
        BigInteger bigNumber1 = new BigInteger("1000000000000000000000000000");
        BigInteger result = bigNumber1.add(new BigInteger("123"))
                .subtract(new BigInteger("333"))
                .multiply(new BigInteger("2"));
    }
}
