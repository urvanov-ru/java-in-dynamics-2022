package ru.urvanov.javaindynamics2022.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Authors.class)
@interface Author {
    String value();
}