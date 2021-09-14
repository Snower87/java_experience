package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 5.8. Промежуточные операции. Метод flatMap()
 * @Раздел 1.4.2. Stream API
 * @Описание Метод flatMap() служит для получения стрима объектов, т.е. Stream.
 * Например:
 * - List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4));
 * - lists.stream()                                 // получаем стрим из List<Integer>
 * -        .flatMap(subList -> subList.stream())   // получаем стрим из элементов
 * -        .forEach(el -> System.out.println(el));
 * Ваша задача элементы вложенных списков собрать в один список.
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _5_8_FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(subList -> subList.stream())
                .collect(Collectors.toList());
    }
}
