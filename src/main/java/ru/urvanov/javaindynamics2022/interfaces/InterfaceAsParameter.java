package ru.urvanov.javaindynamics2022.interfaces;

public class InterfaceAsParameter {
    void someMethod(Obstacle obstacle, Enemy enemy) {
        if (obstacle instanceof Enemy) {
            // Приводим к интерфейсу Enemy
            Enemy obstacleEnemy = (Enemy) obstacle;
            // остальные действия.
        }
        // Объявляем переменную с типом интерфейса Monstr.
        Monster monstr = null;

        //...
    }
}
