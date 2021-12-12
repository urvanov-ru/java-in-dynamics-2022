package ru.urvanov.javaindynamics2022.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardInheritance {
    public static void main(String[] args) {
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number> numList = intList;  // OK.
                  // List<? extends Integer> дочерний тип
                  // от List<? extends Number>
    }
}
