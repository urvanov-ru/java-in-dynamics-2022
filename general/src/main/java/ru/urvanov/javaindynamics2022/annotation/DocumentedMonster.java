package ru.urvanov.javaindynamics2022.annotation;

import java.lang.annotation.Documented;

@Documented
@interface DocumentedMonster {
    String author();
    String sprites();
    String sound();
    String code();
    String createdAt() default "0000-00-00";
    String description();

    // Example of array use
    String[] comments();
}
