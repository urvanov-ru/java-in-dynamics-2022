package ru.urvanov.javaindynamics2022.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class AllZones {
    public static void main(String[] args) {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

       // Создаём список с зонами и сортируем его.
        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);



        for (String s : zoneList) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
            String out = String.format("%35s %10s%n", zone, offset);

            // Пишем только часовые пояса, которые используют смещение
            // в неполных часах.
            if (secondsOfHour != 0) {
                System.out.printf(out);
            }
        }
    }
}
