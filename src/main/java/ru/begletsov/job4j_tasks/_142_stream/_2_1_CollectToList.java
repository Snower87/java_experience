package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание 2.1. Сборка элементов. Сборка в List
 * @Раздел 1.4.2. Stream API
 * @Описание Часто бывает нужно собрать результат обработки через стримы в список. Для этого мы можем использовать
 * методы collect() и Collectors.toList(). Сборка идет в ArrayList.
 * Например:
 * - List<Integer> result = List.of(1, 2).stream().collect(Collectors.toList());
 * Ваша задача собрать, переданный стрим в список
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class _2_1_CollectToList {
    public static List<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toList());
    }
}
