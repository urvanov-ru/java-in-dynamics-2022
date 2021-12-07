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

    public static void main(String[] args) {
        Lair<Goblin> goblinLair = new Lair<Goblin>();
        // указываем жителя.
        goblinLair.setInhabitant(new Goblin());
        // Приведение типа уже не нужно.
        Goblin goblin = goblinLair.getInhabitant();

        // Бриллиантовая операция
        Lair<Goblin> goblinLair2 = new Lair<>();
    }
}