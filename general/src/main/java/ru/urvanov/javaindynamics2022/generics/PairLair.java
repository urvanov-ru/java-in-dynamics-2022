package ru.urvanov.javaindynamics2022.generics;

class PairLair<T, S> {
    T inhabitant1;
    S inhabitant2;

    public void setInhabitant1(T inhabitant1) {
        this.inhabitant1 = inhabitant1;
    }

    public T getInhabitant1() {
        return this.inhabitant1;
    }

    public void setInhabitant2(S inhabitant2) {
        this.inhabitant2 = inhabitant2;
    }

    public S getInhabitant2() {
        return this.inhabitant2;
    }

    public static void main(String[] args) {
        PairLair<Goblin, Genie> goblinGenieLair = new PairLair<>();
        goblinGenieLair.setInhabitant1(new Goblin());
        goblinGenieLair.setInhabitant2(new Genie());
        Goblin goblin = goblinGenieLair.getInhabitant1();
        Genie genie = goblinGenieLair.getInhabitant2();
    }
}

class Genie {
}
