package ru.urvanov.javaindynamics2022.datetime;

public class DateExample {
    public static void main(String[] args) {
        // Создаём экземпляр с текущей датой и временем.
        java.util.Date currentDate = new java.util.Date();

        // Создаём экземпляр, содержащий время, получившееся по
        // прошествии  указанного количества миллисекунд от
        // 1 января 1970 года 00:00 GMT. Обычно используется
        // для конвертации из других форматов даты и времени.
        java.util.Date dateByMillis = new java.util.Date(29368498236L);

        System.out.println("currentDate = " + currentDate);
        System.out.println("dateByMillis = " + dateByMillis);
    }
}
