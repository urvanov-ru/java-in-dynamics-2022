package ru.urvanov.javaindynamics2022.annotation;

@interface Monster {
    String author();
    String sprites();
    String sound();
    String code();
    String createdAt() default "0000-00-00";
    String description();

    // Пример использования массива
    String[] comments();
}
