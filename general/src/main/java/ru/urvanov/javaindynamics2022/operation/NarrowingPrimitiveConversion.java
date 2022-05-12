package ru.urvanov.javaindynamics2022.operation;

/**
 * Примеры сужающего преобразования примитивов
 */
public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        double d1 = 2.3;
        double dPositiveInfinity = Double.POSITIVE_INFINITY;
        double dNegativeInfinity = Double.NEGATIVE_INFINITY;
        double dPlusZero = +0.0;
        double dMinusZero = -0.0;
        double dNaN = Double.NaN;

        float fPositiveInfinity = (float) dPositiveInfinity; // +Infinity
                                             // сужающее преобразование
        float fNegativeInfinity = (float) dNegativeInfinity; // -Infinity
                                            // сужающее преобразование
        float fPlusZero = (float) dPlusZero; //0.0f сужающее преобразование
        float fMinusZero = (float) dMinusZero; //-0.0f сужающее преобразование
        float fNaN = (float) dNaN; // NaN сужающее преобразование
        float f1 = (float) d1;             // сужающее преобразование
        int n = (int) d1; // 2             // сужающее преобразование.
                                           // Дробная часть отбрасывается

        System.out.println(fPositiveInfinity);
        System.out.println(fNegativeInfinity);
        System.out.println(fPlusZero);
        System.out.println(fMinusZero);
        System.out.println(fNaN);
        System.out.println(f1);
        System.out.println(n);
    }
}
