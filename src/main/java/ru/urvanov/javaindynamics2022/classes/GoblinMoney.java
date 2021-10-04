package ru.urvanov.javaindynamics2022.classes;

/**
 * Передача параметров по ссылке.
 */
public class GoblinMoney {
    private int money;

    /**
     * @param goblinMoney передаётся по ссылке.
     *      Меняя его поля мы меняем исходный объект.
     * @param arr1 тоже передаётся по ссылке.
     *             Меняя значения в нём мы меняем исходный массив.
     */
    public static void tryChangeParameterValue(GoblinMoney goblinMoney, int[] arr1) {

        // Эти изменения будут видны снаружи метода.
        goblinMoney.money++;
        arr1[0] = 200;

        // Эти изменения затрагивают только наш параметр ссылочного типа
        // Объекты снаружи метода не будут изменены.
        goblinMoney = null;
        arr1 = null;
        goblinMoney = new GoblinMoney();
        goblinMoney.money = -400;
        arr1 = new int[100];
        arr1[2] = 3;
    }

    public static void main(String[] args) {
        GoblinMoney goblin = new GoblinMoney();
        goblin.money = 45;
        int[] arr1 = {3, 4, 7};
        tryChangeParameterValue(goblin, arr1);
        System.out.println(goblin.money); // 46
        System.out.println(arr1[0]); // 200;
        System.out.println(arr1[2]); // 7
    }
}
