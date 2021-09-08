package ru.begletsov.job4j_tasks._142_stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание 2.3. Сборка элементов. Сборка в Map
 * @Раздел 1.4.2. Stream API
 * @Описание Для того чтобы собрать данные в мапу, мы можем использовать методы collect() и Collectors.toMap().
 * Сборка идет в HashMap. Например:
 * Map<Integer, Integer> result = Set.of(1, 2).stream().collect(Collectors.toMap(k -> k, v -> v));
 * В качестве первого аргумента мы указываем, как мы будет строить ключ из элемента стрима, а в качестве второго
 * как будем строить значение. В примере, ключом и значением будет сам элемент.
 * Ваша задача собрать, переданный стрим чисел в мапу, где ключ сам элемент, а значение это его квадрат
 * @author Sergei Begletsov
 * @since 08.09.2021
 * @version 1
 */

public class _2_3_CollectToMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v));
    }

    public static Map<Integer, String> collectToStr(Stream<Integer> data) {
        //return data.collect(Collectors.toMap(k -> k, v -> Integer.toString(v * v)));
        return data.collect(Collectors.toMap(Function.identity(), v -> Integer.toString(v * v)));
    }
}
