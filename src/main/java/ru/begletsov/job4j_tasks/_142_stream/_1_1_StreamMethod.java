package ru.begletsov.job4j_tasks._142_stream;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * @Задание 1.1. Создание стрима. Метод stream()
 * @Раздел 1.4.2. Stream API
 * @Описание Чаще всего Вам предстоит создавать стрим из коллекций. Для это достаточно вызвать метод stream().
 * Например:
 * - List.of(1, 2, 3).stream()
 * Заметьте, что метода stream() в Map и его реализациях нет. Но есть методы keySet, entrySet(), values() которые
 * возвращают реализации Collection, поэтому после вызовов этих методов можно вызвать метод stream().
 * Ниже, приведен код. Создайте стрим из переданной коллекции
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
 */

public class _1_1_StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }
}
