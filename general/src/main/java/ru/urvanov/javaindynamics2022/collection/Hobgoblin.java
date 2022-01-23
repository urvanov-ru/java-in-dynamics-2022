package ru.urvanov.javaindynamics2022.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Hobgoblin {

    private String name;
    private Role role;
    private int gold;
    private double health = 100.0;
    private double power = 30.0;

    public enum Role {
        WARRIOR,
        MAGE,
        ARCHER
    }

    public Hobgoblin(String name, Role role, int gold, double health, double power) {
        this.name = name;
        this.role = role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        hobgoblins.add(new Hobgoblin("Ужасный Фро", Role.MAGE, 2, 99, 31));
        hobgoblins.add(new Hobgoblin("Стареющий Эд", Role.WARRIOR, 23, 36, 12));
        hobgoblins.add(new Hobgoblin("Богатейший Джолливер", Role.MAGE, 300, 80, 25));
        hobgoblins.add(new Hobgoblin("Дохляк Эрни", Role.ARCHER, 6, 88, 15));
        hobgoblins.add(new Hobgoblin("Бледный Сэм", Role.WARRIOR, 59, 60, 15));

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

        System.out.println("Среднее количество золота у всех домовых:");
        OptionalDouble average = hobgoblins
                .stream()
                .mapToInt(Hobgoblin::getGold)
                .average();
        System.out.println("average gold: " + average.getAsDouble());

        System.out.println();

        System.out.println("Сумма золота у всех домовых:");
        int sum1 = hobgoblins
                .stream()
                .mapToInt(Hobgoblin::getGold)
                .sum();
        System.out.println("sum1: " + sum1);
        int sum2 = hobgoblins
                .stream()
                .map(Hobgoblin::getGold)
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum2: " + sum2);

        System.out.println();

        System.out.println("Преобразуем в объединённого богатого домового:");
        HobgoblinMorph hobgoblinMorph = hobgoblins.stream()
                        .collect(
                                HobgoblinMorph::new,
                                HobgoblinMorph::accept,
                                HobgoblinMorph::combine);
        System.out.println(hobgoblinMorph.morph());

        System.out.println();

        List<Integer> hobgoblinGolds = hobgoblins.stream()
                .map(Hobgoblin::getGold)
                .collect(Collectors.toList());

        System.out.println();

        Map<Role, List<Hobgoblin>> groupedHobgoblins = hobgoblins.stream()
                .collect(Collectors.groupingBy(Hobgoblin::getRole));

    }
}
