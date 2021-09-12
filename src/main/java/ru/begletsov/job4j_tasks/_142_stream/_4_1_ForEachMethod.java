package ru.begletsov.job4j_tasks._142_stream;

import java.util.stream.Stream;

/**
 * @Задание 4.1. Терминальные операции. Метод forEach()
 * @Раздел 1.4.2. Stream API
 * @Описание Если нам нужно выполнить какое-то действие над каждым элементом стрима, при этом нам не нужно ничего
 * возвращать, то мы можем использовать метод forEach().
 * Например:
 * - List.of(1, 2, 3).stream().forEach(n -> System.out.println(n));
 * Ваша задача вывести элементы стрима в консоль через System.out.println()
 * @author Sergei Begletsov
 * @since 12.09.2021
 * @version 1
 */

public class _4_1_ForEachMethod {
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
