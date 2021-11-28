package ru.urvanov.javaindynamics2022.annotation;

public class PredefinedAnnotations extends ParentPredefinedAnnotations{

    PredefinedAnnotations objectOne;

    /**
     * @deprecated
     * explanation of why it was deprecated
     */
    @Deprecated
    static void deprecatedMethod() { }

    @Override
    public int myMethod1(double x) {
        // ...
        return 10;
    }

    // Указываем компилятору не генерировать
    // предупреждение об использовании
    // устаревшего метода.
    @SuppressWarnings("deprecation")
    void useDeprecatedMethod() {
        // Используем устаревший метод.
        objectOne.deprecatedMethod();
    }
}
