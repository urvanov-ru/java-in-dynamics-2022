package ru.urvanov.book.javaindynamics2022.operation;

/**
 * примеры битовых операций
 */
public class Bitwise {
    public static void main(String[] args) {
        int n1 = 4; // 100 в двоичной системе
        System.out.println("n1 >> 1 = " + (n1 >> 1)); //2 или 10
        // в двоичной системе.


        System.out.println("n1 << 1 = " + (n1 << 1)); ;// 8 или 100
        // в двоичной системе.

        System.out.println("0b101 & 0b100 = " + (0b101 & 0b100)); // 4  (0b100)
        System.out.println("0b001 | 0b100 = " + (0b001 | 0b100)); // 5  (0b101)
        System.out.println("0b1110 ^ 0b1011 = " + (0b1110 ^ 0b1011)); //5 (0b101);

        System.out.println("-2 >> 1 = " + (-2 >> 1)); // -1 (единица со знака
        // сдвинется вправо, так что знак не поменяется)


        System.out.println("-2 >>> 1= " + (-2 >>> 1)); // 2147483647 (сменит
        // знак, так как левый бит заполнится нулём).

        System.out.println("~1 = " + ~1) ;  // -2 (0b000...001
        // превратится в 0b1111..10)
    }
}
