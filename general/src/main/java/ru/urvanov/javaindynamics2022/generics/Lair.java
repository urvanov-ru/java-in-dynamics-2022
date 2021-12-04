package ru.urvanov.javaindynamics2022.generics;

// Логово
class Lair<T> {

    // Житель
    T inhabitant;

    public void setInhabitant(T inhabitant) {
        this.inhabitant = inhabitant;
    }

    public T getInhabitant() {
        return this.inhabitant;
    }
}