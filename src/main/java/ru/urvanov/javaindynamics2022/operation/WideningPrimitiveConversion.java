package ru.urvanov.javaindynamics2022.operation;

/**
 * Примеры расширяющего преобразования примитивов
 */
public class WideningPrimitiveConversion {
    public static void main(String[] args) {
        byte b1 = 100;
        short sh1 = b1;  // Расширяющее преобразование byte->short
        char ch1 = 100;
        int i1 = sh1;    // Расширяющее преобразование short->int
        int i2 = ch1;    // Расширяющее преобразование char->int
        long l1 = i1;    // Расширяющее преобразование int->long
        float f1 = l1;   // Расширяющее преобразование long->float
        double d1 = f1;  // Расширяющее преобразование float->double
    }
}
