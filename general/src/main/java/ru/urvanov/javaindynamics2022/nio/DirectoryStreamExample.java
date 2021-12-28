package ru.urvanov.javaindynamics2022.nio;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryStreamExample {
    public static void main(String[] args) {
        // Подставьте сюда путь к каталогу вместо src
        Path dir = Paths.get("src");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException не может броситься во время итерации.
            // В этом куске кода оно может броситься только
            // методом newDirectoryStream.
            System.err.println(x);
        }
    }
}
