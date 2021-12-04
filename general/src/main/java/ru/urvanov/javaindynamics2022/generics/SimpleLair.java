package ru.urvanov.javaindynamics2022.generics;

// Логово
class SimpleLair {

    // Житель
    Object inhabitant;

    public void setInhabitant(Object inhabitant) {
        this.inhabitant = inhabitant;
    }

    public Object getInhabitant() {
        return this.inhabitant;
    }
}

class Goblin {
}

class Main {
    public static void main(String[] args) {
        SimpleLair lair = new SimpleLair();
        // указываем жителя.
        lair.setInhabitant(new Goblin());
        // Нужно явное приведение типа!
        Goblin goblin = (Goblin) lair.getInhabitant();
    }
}