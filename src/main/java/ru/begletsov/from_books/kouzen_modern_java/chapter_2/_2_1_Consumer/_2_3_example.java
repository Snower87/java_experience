package ru.begletsov.from_books.kouzen_modern_java.chapter_2._2_1_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _2_3_example {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        //1. Реализация с анонимным внутренним классом
        System.out.println("1. Реализация через анонимный класс:");
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();

        //2. Лямбда-выражение
        System.out.println("2. Реализация через лямбда-выражение:");
        strings.forEach(s -> System.out.println(s));
        System.out.println();

        //3. Ссылка на метод
        System.out.println("3. Реализация через ссылку на метод:");
        strings.forEach(System.out::println);
        System.out.println();
    }
}
