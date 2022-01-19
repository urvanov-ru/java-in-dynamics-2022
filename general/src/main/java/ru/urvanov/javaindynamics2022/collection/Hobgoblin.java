package ru.urvanov.javaindynamics2022.collection;

import java.time.LocalDate;

public class Hobgoblin {
    public enum Gender {
        MALE, FEMALE
    }

    String name;
    LocalDate birthdate;
    Gender gender;
    int gold;
    double health = 100.0;
    double power = 30.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                ", gold=" + gold +
                ", health=" + health +
                ", power=" + power +
                '}';
    }
}
