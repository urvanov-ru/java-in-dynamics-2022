package ru.urvanov.javaindynamics2022.generics;

import java.util.List;

public class LowerBoundWildcard {

    static class LowerMonster {};

    static class LowerDaemon extends LowerMonster {};

    static class LowerGreatDaemon extends LowerDaemon {};

    public static void processs(List<? super LowerGreatDaemon> list) {
        list.add(new LowerGreatDaemon());
    }
}
