package ru.begletsov.job4j_tasks._142_stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание 2.2. Сборка элементов. Сборка в Set
 * @Раздел 1.4.2. Stream API
 * @Описание Для того чтобы собрать данные в сет, мы можем использовать методы collect() и Collectors.toSet().
 * Сборка идет в HashSet. Например:
 * - Set<Integer> result = Set.of(1, 2).stream().collect(Collectors.toSet());
 * Ваша задача собрать, переданный стрим в сет
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class _2_2_CollectToSet {
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toSet());
    }
}
