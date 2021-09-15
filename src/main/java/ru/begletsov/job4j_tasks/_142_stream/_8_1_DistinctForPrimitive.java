package ru.begletsov.job4j_tasks._142_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Задание 8.1. Промежуточные операции. Метод distinct(). Уникальные числа
 * @Раздел 1.4.2. Stream API
 * @Описание Для того, чтобы получить стрим из уникальных элементов мы можем использовать метод distinct().
 * Если мы используем стрим примитивов, то сравнение элементов идет через ==, если стрим объектов, то через метод equals.
 * Например:
 * - Arrays.stream(new int[] {1, 2, 1}).distinct() // в стриме останутся только 1, 2
 * Ваша задача собрать уникальные числа массива в список
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _8_1_DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        //Вариант 1
        //return IntStream.of(data)
        //Вариант 2
        return Arrays.stream(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}
