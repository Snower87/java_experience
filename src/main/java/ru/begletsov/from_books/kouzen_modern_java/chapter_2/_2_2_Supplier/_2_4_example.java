package ru.begletsov.from_books.kouzen_modern_java.chapter_2._2_2_Supplier;

import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class _2_4_example {
    public static Object createObj(Supplier<Object> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("...");

        //1. Реализация с анонимным внутренним классом
        System.out.println("1. Реализация через анонимный класс:");
        DoubleSupplier randomSupplier = new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return Math.random();
            }
        };
        System.out.println(randomSupplier.getAsDouble());
        System.out.println();

        //2. Лямбда-выражение
        System.out.println("2. Реализация через лямбда-выражение:");
        randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.getAsDouble());
        System.out.println();

        //3. Ссылка на метод
        System.out.println("3. Реализация через ссылку на метод:");
        randomSupplier = Math::random;
        System.out.println(randomSupplier.getAsDouble());
        System.out.println();
    }
}
