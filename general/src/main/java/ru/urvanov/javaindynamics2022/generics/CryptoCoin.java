package ru.urvanov.javaindynamics2022.generics;

import java.util.ArrayList;
import java.util.List;

public class CryptoCoin {
    private String name;

    public CryptoCoin(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<ElvenCoin> ec = new ArrayList<>();
        List<? extends CryptoCoin> cc = ec;
        // ошибка компиляции
        // cc.add(new CryptoCoin("DGC"));
    }
}


class ElvenCoin extends CryptoCoin {
    public ElvenCoin() {
        super("ELC");
    }


}
