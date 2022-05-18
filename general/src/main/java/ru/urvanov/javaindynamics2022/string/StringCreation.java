package ru.urvanov.javaindynamics2022.string;

// Пример создания строк
public class StringCreation {
    public static void main(String[] args) {
        String greeting1 = "Hello world!";

        char[] chardata = { 'h', 'e', 'l', 'l', 'o', '.'};
        String greeting2 = new String(chardata);

        String greeting3 = """
                Hello \
                world!
                """;

        System.out.println(greeting1); // Hello world!
        System.out.println(greeting2); // hello.
        System.out.println(greeting3); // Hello world!


        byte[] byteArray = new byte[] { 0x48,  0x65, 0x6C, 0x6C, 0x6F};
        java.nio.charset.Charset charset
                = java.nio.charset.Charset.forName("ISO-8859-1");
        String str = new String(byteArray, charset);
        System.out.println(str); // Hello

        try {
            String str2 = new String(byteArray, "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException ex) {
            // Вывод информации об ошибке
        }

        System.out.println("Hi, Larry.".length());  // 10

        String personName = "Vasya";
        System.out.println(personName + " goes" + " to school."); // Vasya goes to school.

        String vasyaSchool = "Vasya goes to school."
                + " Petya does the same thing too."
                + " Turtle is green.";
        System.out.println(vasyaSchool);

        String vasyaSchool2 = """
                Vasya goes to school. \
                Petya does the same thing too. \
                Turtle is green.""";
        System.out.println(vasyaSchool2);



        Object obj1 = new Object() {
            @Override
            public String toString() {
                return "obj1toString()";
            }
        };

        Integer integer1 = 23;
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("3.45");
        Object obj2 = null;
        System.out.println("obj1: " + obj1 + "; integer1: "
                + integer1 + "; bigDecimal1: "
                + bigDecimal1 + "; obj2: " + obj2);
    }
}
