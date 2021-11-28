package ru.urvanov.javaindynamics2022.classes;

class GoblinFire {
    int ammo = 10;
    //... другие поля класса

    // метод стрельбы
    public void fire() {
        // уменьшаем количество пуль.
        // Обратите внимание, что к полю класса
        // обращаемся просто по имени
        ammo --;

        // ... остальной код
    }

    // ... другие методы
}