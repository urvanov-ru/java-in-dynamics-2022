package ru.urvanov.javaindynamics2022.generics;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInferenceSimple {

    static <T> T pick(T a1, T a2) { return a2; }

    public static void main(String[] args) {

        Serializable s = pick("d", new ArrayList<String>());
    }
}
