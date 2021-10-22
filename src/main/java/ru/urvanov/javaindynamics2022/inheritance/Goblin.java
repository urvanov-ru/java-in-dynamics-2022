package ru.urvanov.javaindynamics2022.inheritance;

public class Goblin extends Monster {

    double gold = 20.0;
    int trunks;

    Goblin() {

    }

    Goblin(double goblinGold, double monsterGold, int ammo, double health, int trunks) {
        super(monsterGold, ammo, health);
        this.gold = goblinGold;
        this.trunks = trunks;
    }

    @Override
    void instanceMethod() {
        System.out.println("Goblin instance method");
    }

    static void staticMethod() {
        System.out.println("Goblin static method");
    }

    void walk() {
        System.out.println("Goblin walk");
        System.out.println("Goblin gold = " + gold);
        // Мы можем обратиться к скрытому полю родительского класса:
        System.out.println("Monster gold = " + gold);
        System.out.println("Goblin trunks = " + trunks);
        super.walk();
    }
}