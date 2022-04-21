package ru.urvanov.javaindynamics2022.string;


import java.text.Collator;
import java.util.Locale;

public class StringCompare {
    public static void main(String[] args) {

        // Получаем экземпляр Collator в соответствии
        // с русской локалью:
        Collator collator = Collator.getInstance(
                new Locale("ru", "RU"));
        // Или можно получить экземпляр для текущей локали:
        // Collator.getInstance();

        String str1 = "Ёжик";
        String str2 = "Ежик";

        // С помощью значений PRIMARY, SECONDARY, TERTIARY or IDENTICAL
        // можно настраивать минимальный уровень различий.
        // Для разных языков и стран каждое из значений имеет свой смысл.
        // В данном случае для русского языка при PRIMARY буквы Ё и Е будут
        // считаться идентичными, поэтому str1 будет идентична str2.
        collator.setStrength(Collator.PRIMARY);

        int result = collator.compare(str1, str2);
        if (result < 0) {
            System.out.println(
                    String.format("%s должен быть перед %s.", str1, str2));
        } else if (result == 0) {
            System.out.println(
                    String.format("%s и %s одинаковы.", str1, str2));
        } else {
            System.out.println(
                    String.format("%s должен быть после %s.", str1, str2));
        }
    }
}
