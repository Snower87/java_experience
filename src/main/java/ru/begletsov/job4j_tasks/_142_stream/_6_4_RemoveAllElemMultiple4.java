package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 6.4. Удалить из числового списка все элементы, кратные 4
 * @Раздел 1.4.2. Stream API
 * @Описание Дан исходный список. Получить список без элементов, кратных 4, из исходного списка.
 * Например: {1, 2, 3, 4, 5, 8} -> {1, 2, 3, 5}
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _6_4_RemoveAllElemMultiple4 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                    .filter(num -> (num % 4) != 0)
                    .collect(Collectors.toList());
    }
}
