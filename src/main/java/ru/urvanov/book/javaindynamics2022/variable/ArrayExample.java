package ru.urvanov.book.javaindynamics2022.variable;

public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray = {10, 3, -4, 67};
        double [] arrayOfDouble = new double[3];
        myArray[0] = 12;
        arrayOfDouble[2] = 3.4;
        System.out.println("The first element of myArray is "
                + myArray[0]); // 12
        System.out.println("The second element of myArray is "
                + myArray[1]);  // 3
        System.out.println("The third element of arrayOfDouble is "
                + arrayOfDouble[2]); // 3.4
    }
}
