package ru.urvanov.javaindynamics2022.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoriesByFilter {
    public static void main(String[] args) {
        DirectoryStream.Filter<Path> filter =
                new DirectoryStream.Filter<Path>() {
            public boolean accept(Path file) throws IOException {
                return (Files.isDirectory(file));
            }
        };
        // Подставьте сюда путь к каталогу вместо target/classes
        Path dir = Paths.get("target/classes");
        try (DirectoryStream<Path>
                     stream = Files.newDirectoryStream(dir, filter)) {
            for (Path entry: stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
