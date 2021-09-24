package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Операция присваивания
 */
public class Assignment {
    public static void main(String[] args) {
        int x1 = 3;
        long l1 = 10_000_000_000L;
        float f1 = 1.3f;
        double weight = 81.34;
        byte b1  = 100;
        short sh1 = -10000;
        char ch1 = 60000;



        double d1 = 2; // Это можно
        // int x2 = 2.3; // так нельзя. Будет ошибка компиляции.

        byte b2 = 100; //Это можно, так как литерал 100 гарантировано
                       // поместится в byte.



        // byte b3 = 10000; //Нельзя. Ошибка компиляции.




        int n = 100;
        // byte b4 = n; // А вот так тоже нельзя, так как
                     // переменная n имеет тип int.


        int x3;
        int y1;
        int z1 = x3 = y1 = 10; // y1, x3 и z1 будет присвоено 10.
    }
}
