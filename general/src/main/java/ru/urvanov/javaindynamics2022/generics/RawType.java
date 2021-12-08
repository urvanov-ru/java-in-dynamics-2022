package ru.urvanov.javaindynamics2022.generics;

// Пример использования сырого типа
public class RawType {
    public static void main(String[] args) {
        Lair<Goblin> goblinLair1 = new Lair<>();

        Lair lair1 = new Lair();

        Lair<Goblin> goblinLair2 = new Lair<>();
        Lair lair2 = goblinLair2; // OK

        Lair lair3 = new Lair();
        Lair<Goblin> goblinLair3 = lair3; // warning

        Lair<Goblin> goblinLair4 = new Lair<>();
        Lair lair4 = goblinLair4;
        lair4.setInhabitant(new Goblin()); // warning
    }
}
