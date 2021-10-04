package ru.urvanov.javaindynamics2022.classes;

class GoblinWithCounter {
    static int idCounter = 0;
    int id;

    GoblinWithCounter() {
        idCounter++;
        id = idCounter;
    }
}