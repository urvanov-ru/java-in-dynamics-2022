package ru.urvanov.javaindynamics2022.collection;

import java.util.function.Consumer;

public class HobgoblinMorph implements Consumer<Hobgoblin> {
    private int gold;
    private double power;
    private int count;

    @Override
    public void accept(Hobgoblin other) {
        count++;
        gold+= other.getGold();
        power+= other.getPower();
    }

    public void combine(HobgoblinMorph hobgoblinMorph) {
        this.gold += hobgoblinMorph.getGold();
        this.power += hobgoblinMorph.getPower();
        this.count += hobgoblinMorph.getCount();
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Hobgoblin morph() {
        return new Hobgoblin("WeatlhyHobgoblin", gold, 100.0, power / count);
    }

}
