package ru.urvanov.javaindynamics2022.generics;

// Пример использования обобщённого метода
class Utils {
    // Обобщённый метод.
    static <T> void setIfNull(Lair<T> lair, T t) {
        if (lair.getInhabitant() == null) {
            lair.setInhabitant(t);
        }
    }

    // Ограниченный обобщённый метод
    public static<T extends Monster & Enemy & Dreadful> void doSomething(T[] monsters) {
        T result = null;
        for (T obj : monsters) {

            obj.doSomething();
        }
    }

    static class FoxSpirit  extends Monster implements Enemy, Dreadful {

    }

    public static void main(String[] args) {
        // Вызов обобщённого метода
        Lair<Goblin> goblinsLair = new Lair<>();
        Utils.<Goblin>setIfNull(goblinsLair, new Goblin());

        Utils.setIfNull(goblinsLair, new Goblin());


        // Вызов ограниченного обобщённого метода.
        FoxSpirit[] foxSpirits = new FoxSpirit[10];
        for (int n = 0; n < foxSpirits.length; n++) {
            foxSpirits[n] = new FoxSpirit();
        }
        Utils.doSomething(foxSpirits);
    }
}