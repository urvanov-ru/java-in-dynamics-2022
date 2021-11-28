package ru.urvanov.javaindynamics2022.inheritance;

public class OverridingHiding {
    public static void main(String[] args) {
        System.out.println("Begin test:");

        Monster monster = new Monster();
        Monster goblin = new Goblin();

        monster.instanceMethod();
        goblin.instanceMethod();

        Monster.staticMethod();
        Goblin.staticMethod();
    }
}
