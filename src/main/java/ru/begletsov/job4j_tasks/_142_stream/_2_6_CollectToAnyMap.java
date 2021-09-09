package ru.begletsov.job4j_tasks._142_stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание 2.6. Сборка элементов. Сборка в произвольную реализацию Map
 * @Раздел 1.4.2. Stream API
 * @Описание Ранее мы сталкивались с реализацией toMap с тремя аргументами. Этот метод перегружен и имеет реализацию
 * с четырьмя аргументами, где в качестве четвертого аргумента мы можем указать реализацию Map, которую мы хотим получить
 * Например:
 * - Map<Integer, Integer> map = List.of(1, 2, 1).stream().collect(
 * -                                                Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev, TreeMap::new));
 * В данном случае мы получим реализацию Map, но только TreeMap.
 * Ваша задача собрать Map из стрима чисел, где ключ это само число, а значение его квадрат. Сборка должна быть в LinkedHashMap
 * @author Sergei Begletsov
 * @since 09.09.2021
 * @version 1
 */

public class _2_6_CollectToAnyMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev, LinkedHashMap::new));
    }
}
