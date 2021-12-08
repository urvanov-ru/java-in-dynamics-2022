package ru.urvanov.javaindynamics2022.generics;

public class BoundedGenericMethod {
    // Обобщённый метод.
    static <T> void setIfNull(Lair<T> lair, T t) {
        if (lair.getInhabitant() == null) {
            lair.setInhabitant(t);
        }
    }

    // Ограниченный обобщённый метод
    public static <T extends Monster & Enemy & Dreadful> void doSomething(T[] monsters) {
        T result = null;
        for (T obj : monsters) {

            obj.doSomething();
        }
    }

    static class FoxSpirit extends Monster implements Enemy, Dreadful {

    }

    public static void main(String[] args) {
        // Вызов ограниченного обобщённого метода.
        BoundedGenericMethod.FoxSpirit[] foxSpirits = new BoundedGenericMethod.FoxSpirit[10];
        for (int n = 0; n < foxSpirits.length; n++) {
            foxSpirits[n] = new BoundedGenericMethod.FoxSpirit();
        }
    }
}
