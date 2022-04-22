package ru.urvanov.javaindynamics2022.generics;

import java.util.List;

public class UpperBoundedWildcard {

    class UpperMonster {}

    class UpperDaemon extends UpperMonster {};

    class UpperGreatDaemon extends UpperDaemon {};

    public void process(List<? extends UpperMonster> list) {
        for (UpperMonster elem : list) {
            // ...можно использовать методы из UpperMonster
        }
    }

}
