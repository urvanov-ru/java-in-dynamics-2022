package ru.urvanov.javaindynamics2022.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                2022, // Год
                1, // Месяц
                31,  // День месяца
                8, // час
                51, // Минуты
                0,  // Секунды
                0, // Наносекунды
                ZoneId.of("Europe/Moscow"));
        String formattedIso = zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println(formattedIso);

        DateTimeFormatter fullFormatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL)
                .withLocale(new Locale("ru", "RU"));
        String formattedFull = zonedDateTime.format(fullFormatter);
        System.out.println(formattedFull);

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(
                        FormatStyle.SHORT, FormatStyle.SHORT)
                .withLocale(new Locale("ru", "RU"));
        String formattedShort = zonedDateTime.format(shortFormatter);
        System.out.println(formattedShort);

        // С локальню по умолчанию
        String formattedWithSystemLocale = zonedDateTime.format(
                DateTimeFormatter.ofLocalizedDateTime(
                        FormatStyle.FULL, FormatStyle.FULL));
        System.out.println(formattedWithSystemLocale);

        ZonedDateTime parsedZonedDateTime = ZonedDateTime.parse(
                "2022-01-31T08:51:00+03:00[Europe/Moscow]",
                DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println(parsedZonedDateTime);

    }
}
