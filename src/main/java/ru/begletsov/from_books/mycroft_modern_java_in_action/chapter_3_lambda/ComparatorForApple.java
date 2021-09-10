package ru.begletsov.from_books.mycroft_modern_java_in_action.chapter_3_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс-сервис для работы с яблоками
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 10.09.2021
 * @version 1
 */

public class ComparatorForApple {
    private List<Apple> apples = null;

    public ComparatorForApple(List<Apple> apples) {
        this.apples = apples;
    }

    /**
     * Фильтрация списка яблок через Predicate (тест)
     * @param predicate входной фильтр
     * @return список яблок, удовлетворяющих заданным условиям
     */
    public List<Apple> find(Predicate<Apple> predicate) {
        List<Apple> list = new ArrayList<>();
        for (Apple apple: apples) {
            if (predicate.test(apple)) {
                list.add(apple);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(COLOR.GREEN, 8, 6.7),
                new Apple(COLOR.RED, 4, 1.5),
                new Apple(COLOR.GREEN, 6, 4.8),
                new Apple(COLOR.RED, 2, 9.2),
                new Apple(COLOR.GREEN, 7, 8.8),
                new Apple(COLOR.RED, 1, 4.5),
                new Apple(COLOR.RED, 3, 2.9),
                new Apple(COLOR.RED, 5, 6.7),
                new Apple(COLOR.GREEN, 10, 3.3),
                new Apple(COLOR.GREEN, 9, 5.12)
        );
    }
}
