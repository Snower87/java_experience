package ru.begletsov.try_catch;

/**
 * Класс OverrideFinalize переопределен метод finalize при сборке мусора GC
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 04.08.2020
 * @version 1
 */

public class OverrideFinalize {
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed by Garbage Collector");
    }

    public static void main(String[] args) {
        OverrideFinalize obj = new OverrideFinalize();
        obj = null;
        System.gc();
    }
}
