package ru.urvanov.javaindynamics2022.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {

    public static void process(List<? extends Monster> list) {
        for (Monster elem : list) {
            // ...
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));
    }
}
