package ru.begletsov.job4j_tasks._142_stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Задание 2.8. Сборка элементов. Сборка в Map, когда есть дубликаты
 * @Раздел 1.4.2. Stream API
 * @Описание Метод, который был показан ранее нельзя использовать, если стрим содержит дубликаты. Для того чтобы
 * собрать данные в мапу в этом случае, мы можем использовать методы collect() и Collectors.toMap(), но перегруженный.
 * Сборка идет в HashMap. Например:
 * - Map<Integer, Integer> result = List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev));
 * В качестве первого аргумента мы указываем, как мы будем строить ключ из элемента стрима, а в качестве второго
 * как будем строить значение. В качестве третьего аргументы мы указываем, что делать в случае дубликата ключа,
 * оставим мы старое значение или новое В примере, ключом и значением будет сам элемент, а в случае дубликата мы указываем,
 * что останется предыдущее значение.
 * Ваша задача собрать, переданный стрим чисел в мапу, где ключ сам элемент, а значение это его квадрат. Нужно использовать
 * версию toMap() описанную в задании.
 * @author Sergei Begletsov
 * @since 09.09.2021
 * @version 1
 */

public class _2_8_CollectToMapWhenDublicate {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev));
    }
}
