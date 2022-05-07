package ru.urvanov.javaindynamics2022.multithreading;

import java.util.Arrays;

public class ResourceLoadProcessExample {
    // Ресурсы. В нашем случае просто массив байт
    private byte[] resource;
    // True, если ресурсы ещё не загружены.
    // False, если ресурсы загружены и готовы к обработке
    private boolean empty = true;

    public synchronized byte[] getLoaded() {
        // Ждём, пока нет загруженного ресурса.
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Меняем статус
        empty = true;
        // Пробуждаем загрузчик
        notifyAll();
        return resource;
    }

    public synchronized void loaded(byte[] resource) {
        // Ждём, пока предыдущий ресурс не обработан.
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Переключаем статус.
        empty = false;
        // Загруженный ресурс
        this.resource = resource;
        // Пробуждаем обработчик ресурсов.
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        ResourceLoadProcessExample resourceLoadProcessExample
                = new ResourceLoadProcessExample();


        Thread processor = new Thread(() -> {
            boolean workMore = true;
            while (workMore) {
                byte[] resource = resourceLoadProcessExample.getLoaded();

                if (resource == null) {
                    workMore = false;
                } else {
                    System.out.println("Processing resource: "
                            + Arrays.toString(resource));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        workMore = false;
                    }
                }
            }
        });

        Thread loader = new Thread(() -> {
            for (int n = 0; n < 10; n++) {
                byte[] loadedResource = new byte[10];
                Arrays.fill(loadedResource, (byte) n);
                resourceLoadProcessExample.loaded(loadedResource);
                try {
                    Thread.sleep(n * 1_000);
                } catch (InterruptedException e) {}
            }
            resourceLoadProcessExample.loaded(null);

        });
        loader.start();
        processor.start();
        loader.join();
        processor.join();

    }
}
