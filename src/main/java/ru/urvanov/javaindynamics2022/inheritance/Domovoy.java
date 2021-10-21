package ru.urvanov.javaindynamics2022.inheritance;

interface HouseSpirit {
    default void writeName() {
        System.out.println("House spirit");
    }
}

public class Domovoy implements Obstacle, HouseSpirit {

    @Override
    public void writeName() {
        System.out.println("Domovoy");
    }

    public static void main(String[] args) {
        Domovoy dryad = new Domovoy();
        dryad.writeName();
    }
}
