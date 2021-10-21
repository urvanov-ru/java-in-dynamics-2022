package ru.urvanov.javaindynamics2022.inheritance;

interface Obstacle {
    default void writeName() {
        System.out.println("Obstacle");
    }
}

interface ForestDeity extends Obstacle {
    default void writeName() {
        System.out.println("Forest deity");
    }
}


interface SlavicBeast extends Obstacle {}


public class Leshy implements SlavicBeast, ForestDeity {
    public static void main(String[] args) {
        Leshy leshy = new Leshy();
        leshy.writeName();
    }

}
