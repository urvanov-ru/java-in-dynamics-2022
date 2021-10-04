package ru.urvanov.javaindynamics2022.classes;

/**
 * Пример метода с переменным числом параметров
 */
public class Varargs {
    public void sum(
            int par1,
            double par2,
            String par3,
            int... lastParameter) {
        System.out.println("lastParameter[0] = " + lastParameter[0]); // 3
        System.out.println("lastParameter[1] = " + lastParameter[1]); // 5
        //...

    }

    public static void main(String[] args) {
        Varargs main = new Varargs();
        main.sum(100, 3.4, "par3", 3, 5, 6, 8, 9);
    }
}
