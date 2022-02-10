package ru.urvanov.javaindynamics2022.formatparse;

public class NumberFormatExample {
    public static void main(String[] args) {
        String str1 = java.text.NumberFormat.getInstance().format(10_000_000.34);
        String str2 = java.text.NumberFormat.getInstance().format(8000);
        String str3 = java.text.NumberFormat.getInstance().format(new java.math.BigDecimal("34000.56"));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        try {
            Number var1 = java.text.NumberFormat.getInstance().parse(str1);
            Number var2 = java.text.NumberFormat.getInstance().parse(str2);
            Number var3 = java.text.NumberFormat.getInstance().parse(str3);
            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var3);
        } catch (java.text.ParseException pe) {
            pe.printStackTrace();
        }
    }
}
