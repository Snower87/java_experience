package ru.begletsov.from_books.kouzen_modern_java.chapter_2._2_4_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _2_13_example {
    public static final Predicate<Integer> predicateLength = num -> num > 5;

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mal", "Wash", "Kaylee", "Inara",
                "Zoё", "Jayne", "Simon", "River", "Shepherd Book");

        //1. Реализация с анонимным внутренним классом
        System.out.println("1. Реализация через анонимный класс:");
        List<Integer> namesLength = names.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                })
                .collect(Collectors.toList());
        namesLength.forEach(System.out::println);
        System.out.println();

        //2. Лямбда-выражение
        System.out.println("2. Реализация через лямбда-выражение:");
        namesLength = names.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        namesLength.forEach(System.out::println);
        System.out.println();

        //3. Ссылка на метод
        System.out.println("3. Реализация через ссылку на метод:");
        namesLength = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        namesLength.forEach(System.out::println);
        System.out.println();

        //4. Фильтрация данных по длине
        System.out.println("4. Фильтрация данных по длине");
        List<Integer> namesLength2 =
                namesLength.stream()
                .filter(predicateLength)
                .collect(Collectors.toList());
        namesLength2.forEach(System.out::println);
        System.out.println();
    }
}
