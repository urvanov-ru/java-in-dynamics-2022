package ru.urvanov.javaindynamics2022.nestedclass;

class Lambda {
    interface Operation {
        int operation(int x, int y);
    }

    interface SimpleOperation {
        void simpleOperation(int x);
    }

    static int[] arrayOperation(
            int[] x,
            int[] y,
            Operation operation) {
        int[] result = new int[x.length];
        for (int n = 0; n < x.length; n++) {
            result[n] = operation.operation(x[n], y[n]);
        }
        return result;
    }

    static void arraySimpleOperation(
            int[] x,
            SimpleOperation simpleOperation) {
        for (int n = 0; n < x.length; n++) {
            simpleOperation.simpleOperation(x[n]);
        }
    }

    public static void main(String[] args) {
        // Пример сложения элементов массива:
        int[] resultSum = arrayOperation(
                new int[] {1, 0, 3},
                new int[] {2, 1, 0},
                (int x, int y) -> x + y);
        // Пример вычитания элементов массива:
        int[] resultMinus = arrayOperation(
                new int[] {1, 2, 3, 4},
                new int[] {2, 2, 3, 1},
                (x, y) -> x - y);

        // Вывод в консоль
        SimpleOperation writelnOperation
                = x -> System.out.println(x);
        System.out.println("Sum result:");
        arraySimpleOperation(resultSum, writelnOperation);
        System.out.println("Minus result:");
        arraySimpleOperation(resultMinus, writelnOperation);
    }
}