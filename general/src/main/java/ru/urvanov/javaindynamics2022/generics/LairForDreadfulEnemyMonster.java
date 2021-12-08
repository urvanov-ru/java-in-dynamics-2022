package ru.urvanov.javaindynamics2022.generics;


interface Enemy {}

interface Dreadful {}

// Указываем несколько верхних границ.
// Если в списке верхних границ есть класс, то
// он обязательно должен идти первым.
class LairForDreadfulEnemyMonster<T extends Monster & Enemy & Dreadful> {

}