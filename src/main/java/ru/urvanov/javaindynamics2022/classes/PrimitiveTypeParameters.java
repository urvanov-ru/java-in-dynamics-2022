package ru.urvanov.javaindynamics2022.classes;

/**
 * Пример передачи параметров примитивных типов.
 * Они передаются по значению.
 */
public class PrimitiveTypeParameters {
    public void tryChangeParameterValue(int val1) {
        // Мы можем менять значение val1,
        // но val1 содержит копию переданного значения.
        // Все изменения val1 видны только внутри этого метода
        System.out.println("Inside method 2: " + val1);  // 100
        val1++;
        System.out.println("Inside method 2: " + val1);  // 101
    }

    public static void main(String[] args) {
        PrimitiveTypeParameters primitiveTypeParameters =
                new PrimitiveTypeParameters();
        int parameter1 = 100;
        System.out.println("parameter1 = " + parameter1); // 100
        primitiveTypeParameters.tryChangeParameterValue(parameter1);
        System.out.println("parameter1 = " + parameter1); // 100
        // изменения внутри метода происходили
        // с копией переменой, а не с нашим
        // parameter1.
    }
}
