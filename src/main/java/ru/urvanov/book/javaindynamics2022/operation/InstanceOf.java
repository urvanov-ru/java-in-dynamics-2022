package ru.urvanov.book.javaindynamics2022.operation;

/**
 * Примеры instanceof
 */
public class InstanceOf {
    public static void main(String[] args) {

        Object obj1 = new String("test1");
        if (obj1 instanceof String) {
            System.out.println("YES");
        }


        Object obj2 = null;
        if (obj2 instanceof String) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
