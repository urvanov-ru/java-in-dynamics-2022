package ru.urvanov.javaindynamics2022.inheritance;

class Monster {

    double gold = 10.0;
    int ammo;
    double health;

    Monster() {

    }

    Monster(double gold, int ammo, double health) {
        this.gold = gold;
        this.ammo = ammo;
        this.health = health;
    }

    void instanceMethod() {
        System.out.println("Monster instance method");
    }

    static void staticMethod() {
        System.out.println("Monster static method");
    }

    void walk() {
        System.out.println("Monster walk");
        System.out.println("Monster gold = " + gold);
        System.out.println("Monster ammo = " + ammo);
        System.out.println("Monster health = " + health);
    }
}