package ru.urvanov.book.javaindynamics2022.variable;

public class FloatingPointLiterals {

    public static void main(String[] args) {
        double d1 = 123.4;
        // То же значение, что и у d1 (1.234 умножить 10 во второй степени)
        double d2 = 1.234e2;
        float f1  = 123.4f;

        // 1 (в шестнадцатеричной системе) умножить на 2 в степени 3.
        // То есть 8.0
        double d3 = 0x1p3;

        // 0xF (в шестнадцатеричной системе) умножить на 2 в степени 3
        // То есть 120.0
        double d4 = 0xFp3;

        double d5 = 1_000.000_001;// 1000.000001
    }
}
