package ru.urvanov.javaindynamics2022.nestedclass;

import java.util.function.Supplier;

class ConstructorReference {

    static ConstructorReference[] createArray(int count, Supplier<ConstructorReference> supplier) {
        ConstructorReference[] result = new ConstructorReference[count];
        for (int n = 0; n < count; n++) {
            result[n] = supplier.get();
        }
        return result;
    }



    public static void main(String[] args) {
        // Лямбда-выражение.
        ConstructorReference[] a1 = createArray(10, () -> new ConstructorReference());

        // То же самое, но с ссылкой на конструктор.
        ConstructorReference[] a2 = createArray(10, ConstructorReference::new);
    }

}