package ru.urvanov.javaindynamics2022.generics;

// Пример использования обобщённого метода
class Utils {
    // Обобщённый метод.
    static <T> void setIfNull(Lair<T> lair, T t) {
        if (lair.getInhabitant() == null) {
            lair.setInhabitant(t);
        }
    }

    public static void main(String[] args) {
        Lair<Goblin> goblinsLair = new Lair<>();
        Utils.<Goblin>setIfNull(goblinsLair, new Goblin());

        Utils.setIfNull(goblinsLair, new Goblin());
    }
}