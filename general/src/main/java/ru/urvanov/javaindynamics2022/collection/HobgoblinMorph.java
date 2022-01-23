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
        this.gold += hobgoblinMorph.gold;
        this.power += hobgoblinMorph.power;
        this.count += hobgoblinMorph.count;
    }

    public Hobgoblin morph() {
        return new Hobgoblin(
                "WeatlhyHobgoblin",
                Hobgoblin.Role.WARRIOR,
                gold,
                100.0,
                power / count);
    }

}
