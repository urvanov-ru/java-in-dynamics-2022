package ru.urvanov.javaindynamics2022.collection;

import java.util.*;

public class LadyMiddaySort {
    static final Comparator<LadyMidday> NAME_ORDER
            = (o1, o2) -> {
        return o1.getName().compareTo(o2.getName());
    };

    public static void main(String[] args) {
        LadyMidday[] ladyMiddayArray = {
                new LadyMidday("Monster1", 10, 3),
                new LadyMidday("Midday killer", 34, 300),
                new LadyMidday("poor", 99, 10),
        };
        List<LadyMidday> ladyMiddays = Arrays.asList(ladyMiddayArray);
        Collections.sort(ladyMiddays, NAME_ORDER);
        System.out.println(ladyMiddays);
    }
}
