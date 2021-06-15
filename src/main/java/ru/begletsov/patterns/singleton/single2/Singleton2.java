package ru.begletsov.patterns.singleton.single2;

/**
 * Пример на языке Java: без ленивой инициализации, с использованием статического инициализатора
 */

public class Singleton2 {
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
        // В этом блоке возможна обработка исключений
    }

    private Singleton2 () {}

    public static Singleton2 getInstance() {
        return instance;
    }
}
