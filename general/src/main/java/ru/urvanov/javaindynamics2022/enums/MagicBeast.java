package ru.urvanov.javaindynamics2022.enums;

enum MagicBeast {
    GOBLIN {
        void doSomething() {
            System.out.println("Do something.");
        }

        public void someEnumMethod() {
            // реализация 1.
        }
    },
    HOBGOBLIN(110, 30) {
        void doOtherThing() {
            System.out.println("Do other thing");
        }

        public void someEnumMethod() {
            // реализация 2.
        }
    },
    GREMLIN(200, 10) {
        public void someEnumMethod() {
            // реализация.
        }
    };

    private int health;
    private int magic;

    MagicBeast() {
    }

    MagicBeast(int health, int magic) {
        this.health = health;
        this.magic = magic;
    }

    // Абстрактный метод
    public abstract void someEnumMethod();

}