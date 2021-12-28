package ru.urvanov.javaindynamics2022.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoriesByGlob {
    public static void main(String[] args) {
        // Подставьте сюда путь к каталогу вместо target/classes
        Path dir = Paths.get("target/classes");
        try (DirectoryStream<Path> stream =
                     Files.newDirectoryStream(dir, "*.{java,class,jar}")) {
            for (Path entry: stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException x) {
            // IOException никогда не бросится во время итерации.
            // В этом куске кода оно может броситься только
            // методом newDirectoryStream
            System.err.println(x);
        }
    }
}
