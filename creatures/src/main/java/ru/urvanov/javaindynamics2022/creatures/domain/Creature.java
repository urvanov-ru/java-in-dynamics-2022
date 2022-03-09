package ru.urvanov.javaindynamics2022.creatures.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.annotation.processing.Generated;
import java.util.Objects;

@Table("creature")
public class Creature {
    @Id
    private long id;
    private double health;
    private double x;
    private double y;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return id == creature.id && Double.compare(creature.health, health) == 0 && Double.compare(creature.x, x) == 0 && Double.compare(creature.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, health, x, y);
    }

    @Override
    public String toString() {
        return "Creature{" +
                "id=" + id +
                ", health=" + health +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
