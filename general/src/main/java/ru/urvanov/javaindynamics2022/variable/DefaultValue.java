package ru.urvanov.javaindynamics2022.variable;

public class DefaultValue {
    static byte byteValue; // 0
    static short shortValue; // 0
    static int intValue; // 0
    static long longValue; // 0L
    static float floatValue; // 0.0f
    static double doubleValue; // 0.0d
    static char charValue; // '\u0000'
    static String stringValue; // null
    static boolean booleanValue; // false

    public static void main(String[] args) {
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("charValue = " + charValue);
        System.out.println("stringValue = " + stringValue);
        System.out.println("booleanValue = " + booleanValue);

        int localIntValue;
        // Не сработает, так как не присвоено начальное значение
        // System.out.println("localIntValue = " + localIntValue);
    }
}
