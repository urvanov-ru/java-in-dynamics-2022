package ru.urvanov.javaindynamics2022.interfaces;

public interface CelticMonster {
    boolean isSensitiveToSilver();
    void logic(VisibleWorld visibleWorld);

    static void logicForSensitiveToSilver(CelticMonster[] celticMonsters,
                                          VisibleWorld visibleWorld) {
        for (CelticMonster celticMonster : celticMonsters) {
            if (celticMonster.isSensitiveToSilver()) {
                celticMonster.logic(visibleWorld);
            }
        }
    }
}