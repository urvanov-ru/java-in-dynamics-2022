package ru.urvanov.book.javaindynamics2022.operation;

import java.time.LocalDate;

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

        // Переменная obj3 типа Object, но фактически содержит LocalDate
        Object obj3 = LocalDate.of(2021,9,28);
        if (obj3 instanceof LocalDate) {
            LocalDate myDate2 = (LocalDate) obj3;
            System.out.println("year=" + myDate2.getYear());
        }
        // pattern matching instance of
        if (obj3 instanceof LocalDate myDate2) {
            System.out.println("year=" + myDate2.getYear());
        }
    }
}
