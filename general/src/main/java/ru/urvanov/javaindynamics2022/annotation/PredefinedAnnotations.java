package ru.urvanov.javaindynamics2022.annotation;

import java.util.List;

public class PredefinedAnnotations extends ParentPredefinedAnnotations{

    PredefinedAnnotations objectOne;

    /**
     * @deprecated
     * Объяснение, почему устарело, что использовать
     * вместо устаревшего метода.
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


    @SafeVarargs
    public final void varargsMethod(List<String>... arrayOfListStrings) {

    }
}
