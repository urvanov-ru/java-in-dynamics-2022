package ru.urvanov.javaindynamics2022.generics;

// У параметра типа указываем верхнюю границу Monster.
class LairForMonster<T extends Monster> {

    T inhabitant;

    public void setInhabitant(T inhabitant) {
        this.inhabitant = inhabitant;
    }

    public T getInhabitant() {
        return this.inhabitant;
    }

    public void tick() {
        if (inhabitant != null) {
            // Можно вызывать методы
            // интерфейса или класса,
            // указанного в качестве верхней
            // границы параметра типа.
            inhabitant.doSomething();
        }
    }

    public static void main(String[] args) {
        LairForMonster<Barghest> barghestLair = new LairForMonster<>();
        barghestLair.setInhabitant(new Barghest());
        barghestLair.tick();
    }
}


class Monster {
    public void doSomething() {
        System.out.println("Doing something.");
    }
}

class Barghest extends Monster {
}
