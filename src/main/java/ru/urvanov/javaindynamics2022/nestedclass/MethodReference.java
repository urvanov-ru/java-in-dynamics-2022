package ru.urvanov.javaindynamics2022.nestedclass;

import java.util.Arrays;

/**
 * Пример ссылок на методы
 */
class MethodReference {

    interface Operation {
        double method1(double x, double y);
    }

    static class OperationProvider {
        static double staticSum(double x, double y) {
            return x + y;
        }

        double instanceMinus(double x, double y) {
            return x - y;
        }
    }

    static double[] massOperation(double[] a, double[] b, Operation operation) {
        double[] result = new double[a.length];
        for (int n = 0; n < a.length; n++ ) {
            result[n] = operation.method1(a[n], b[n]);
        }
        return result;
    }

    public static void main (String[] args) {
        double[] a = {1.0, 2.2, 3.1};
        double[] b = {3.2, 4.1, 9.3};
        final OperationProvider myOperationProvider = new OperationProvider();

        massOperation(a, b, (x, y) -> OperationProvider.staticSum(x, y));
        massOperation(a, b, (x, y) -> myOperationProvider.instanceMinus(x, y));

        // Ссылка на статический метод
        massOperation(a, b, OperationProvider::staticSum);
        // Ссылка на метод экземпляра
        massOperation(a, b, myOperationProvider::instanceMinus);

        // Пример ссылки на статический метод
        massOperation(a, b, OperationProvider::staticSum);

        // Пример ссылки на метод определённого экземпляра
        massOperation(a, b, myOperationProvider::instanceMinus);

        // Пример ссылки на метод экземпляра произвольного объекта
        String[] stringArray = { "Джо", "Александр", "Марфа", "Святослав" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}