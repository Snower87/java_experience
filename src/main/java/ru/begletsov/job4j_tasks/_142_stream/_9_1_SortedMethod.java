package ru.begletsov.job4j_tasks._142_stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 9.1. Промежуточные операции. Метод sorted()
 * @Раздел 1.4.2. Stream API
 * @Описание Для того, чтобы получить отсортированный стрим, можно использовать метод sorted(). Стоит учесть, что
 * реализация этого метода без входных параметров использует реализованный метод compareTo() интерфейса Comparable.
 * Поэтому если вы  сортируете объекты, определенного класса, нужно либо передавать Comparator, либо реализовывать Comparable.
 * Например:
 * - List.of(3, 2, 1).stream().sorted() // получим стрим из 1, 2, 3
 * Ваша задача, получить список отсортированных строк
 * @author Sergei Begletsov
 * @since 16.09.2021
 * @version 1
 */

public class _9_1_SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
