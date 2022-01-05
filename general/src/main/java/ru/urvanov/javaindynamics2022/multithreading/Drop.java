package ru.urvanov.javaindynamics2022.multithreading;

public class Drop {
    // Сообщение, отправленное от поставщика потребителю.
    private String message;
    // True, если потребитель должен ждать поставщика,
    // пока тот не отправит сообщение.
    // false если поставщик должен ждать, пока потребитель
    // не получит сообщение
    private boolean empty = true;

    public synchronized String take() {
        // Ждём, пока нет сообщения.
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        // Меняем статус
        empty = true;
        // Уведомляем поставщика, что статус был изменён.
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        // Ждём, пока сообщение не доставлено.
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        // Переключаем статус.
        empty = false;
        // Сохраняем сообщение.
        this.message = message;
        // Уведомляем потребителя, что статус был изменён.
        notifyAll();
    }
}
