package ru.urvanov.javaindynamics2022.collection;

public class LadyMidday implements Comparable<LadyMidday> {
    private String name;
    private int level;
    private int money;

    public LadyMidday(String name, int level, int money) {
        this.name = name;
        this.level = level;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int compareTo(LadyMidday other) {
        if (other == null) {
            throw new NullPointerException();
        }
        return Integer.compare(level, other.getLevel());
    }

    @Override
    public String toString() {
        return "LadyMidday{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", money=" + money +
                '}';
    }
}
