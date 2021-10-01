package ru.urvanov.javaindynamics2022.variable;

public class SymbolAndStringLiteral {
    public static void main(String[] args) {
        char ch1 = '\t'; // Символ табуляции
        char ch2 = 'f'; // Буква f
        char ch3 = '\u00A9'; // Знак копирайта
        char ch4 = '©'; // В коде можно использовать все символы юникода. Так тоже сработает
        System.out.println("символы: " + ch1 + ch2 + ch3 + ch4);

        String myString1 = "Просто пример строки\nС переводами строк\n";
        System.out.println("myString1 = " + myString1);

        // Текстовые блоки помогают создавать многострочные текстовые литералы
        String myTextBlock1 = """
                Взгляни на милую, когда свое чело
                Она пред зеркалом цветами окружает,
                Играет локоном — и верное стекло
                Улыбку, хитрый взор и гордость отражает.
                """;
        System.out.println("myTextBlock1 = ");
        System.out.println(myTextBlock1);

        // Длинная строковая константа без переводов строк:
        String textBlockWithOneLine = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
        System.out.println("textBlockWithOneLine = " + textBlockWithOneLine);
        // выведет одну строку
        //Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.

        // Выравнивание в текстовых блоках:
        // Каждая строка будет содержать дополнительные пробелы в таком количестве, в котором они были до \s
        String myTextBlockWithAdjust = """
                Взгляни на милую, когда свое чело          \s
                Она пред зеркалом цветами окружает,        \s
                Играет локоном — и верное стекло           \s
                Улыбку, хитрый взор и гордость отражает.   \s
                """;
        System.out.println("myTextBlockWithAdjust = ");
        System.out.println(myTextBlockWithAdjust);
    }
}
