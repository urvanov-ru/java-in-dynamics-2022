package ru.urvanov.javaindynamics2022.console;

import java.io.Console;

// Этот код запускать нужно НЕ
// из IDE. Иначе System.console будет возвращать
// null
public class ReadPassword {
    public static void main(String[] args) {
        Console cons;
        char[] passwd;
        if ((cons = System.console()) != null &&
                (passwd = cons.readPassword(
                        "[%s]", "Password:")) != null) {
            // ...
            java.util.Arrays.fill(passwd, ' ');
        }
    }
}
