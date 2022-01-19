package ru.urvanov.javaindynamics2022.collection;

import java.util.ArrayList;
import java.util.List;

public class Hobgoblin {

    private String name;
    private int gold;
    private double health = 100.0;
    private double power = 30.0;

    public Hobgoblin(String name, int gold, double health, double power) {
        this.name = name;
        this.gold = gold;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Hobgoblin{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                ", health=" + health +
                ", power=" + power +
                '}';
    }

    public static void main(String[] args) {
        List<Hobgoblin> hobgoblins = new ArrayList<>();
        hobgoblins.add(new Hobgoblin("Ужасный Фро", 2, 99, 31));
        hobgoblins.add(new Hobgoblin("Стареющий Эд", 23, 36, 12));
        hobgoblins.add(new Hobgoblin("Богатейший Джолливер", 300, 80, 25));
        hobgoblins.add(new Hobgoblin("Дохляк Эрни", 6, 88, 15));
        hobgoblins.add(new Hobgoblin("Бледный Сэм", 59, 60, 15));

        System.out.println("Список домовых:");
        for (Hobgoblin hobgoblin : hobgoblins) {
            System.out.println(hobgoblin.getName());
        }

        System.out.println();

        System.out.println("Список домовых с помощью Java Stream API:");
        hobgoblins
                .stream()
                .map(Hobgoblin::getName)
                .forEach(System.out::println);

        System.out.println();
    }
}
