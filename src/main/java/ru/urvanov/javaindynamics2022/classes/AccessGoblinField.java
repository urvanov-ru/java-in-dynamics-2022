package ru.urvanov.javaindynamics2022.classes;

public class AccessGoblinField {
    public static void main(String[] args) {
        // Создаём объект GoblinFire
        GoblinFire goblinObj = new GoblinFire();

        // Обращение к полю ammo
        goblinObj.ammo ++;
    }
}
