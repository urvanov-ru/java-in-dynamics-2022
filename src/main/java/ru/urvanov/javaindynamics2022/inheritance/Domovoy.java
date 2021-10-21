package ru.urvanov.javaindynamics2022.inheritance;

interface HouseSpirit {
    default void writeName() {
        System.out.println("House spirit");
    }
}

public class Domovoy implements Obstacle, HouseSpirit {

    // Возникает конфликт методов по умолчанию
    // из двух интерфейсов. Поэтому мы должны
    // обязательно переопределить метод
    @Override
    public void writeName() {
        System.out.println("Domovoy");
    }

    public static void main(String[] args) {
        Domovoy dryad = new Domovoy();
        dryad.writeName();
    }
}
