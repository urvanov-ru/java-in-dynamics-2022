package ru.urvanov.javaindynamics2022.classes;

class LegendaryBeast {
    private double health;
    private int ammo;
    private int gold;

    public LegendaryBeast() {
        this(100.0, 0, 0);
        // ... остальная инициализация.
    }

    public LegendaryBeast(double health) {
        this(health, 0, 0);
        // ... остальная инициализация.
    }

    public LegendaryBeast(double health, int ammo) {
        this(health, ammo, 0);
        // ... остальная инициализация.
    }


    public LegendaryBeast(double health, int ammo, int gold) {
        this.health = health;
        this.ammo = ammo;
        this.gold = gold;
    }
}
