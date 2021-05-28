package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Arrays;

/**
 * @Задание 2.1. Способы сортировки. Сортировка массива примитивов
 * @Раздел 1.3.4. Сортировка
 * @Описание Иногда нужно бывает отсортировать массив. Для этого есть метод void Arrays.sort(массив), который сортирует
 * примитивы в восходящем порядке. Например,
 * - int[] data = {3, 2, 1};
 * - Arrays.sort(data); // теперь массив будет {1, 2, 3}
 * Ваша задача отсортировать переданный массив и вернуть его
 * @author Sergei Begletsov
 * @since 28.05.2021
 * @version 1
 */

public class ArraysSort_2_1 {
    public static long[] sort(long[] data) {
        Arrays.sort(data);
        return data;
    }
}
