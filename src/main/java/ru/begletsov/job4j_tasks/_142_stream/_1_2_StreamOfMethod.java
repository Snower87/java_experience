package ru.begletsov.job4j_tasks._142_stream;

import java.util.stream.Stream;

/**
 * @Задание 1.2. Создание стрима из последовательности. Метод Stream.of()
 * @Раздел 1.4.2. Stream API
 * @Описание Иногда у нас есть последовательность и мы хотим создать стрим из этой последовательности.
 * Для этого мы можем использовать метод Stream.of(T...). Например:
 * - Stream.of(1, 2, 3)
 * Ниже приведен код, создайте стрим из символов 'a', 'b', 'c'
 * @author Sergei Begletsov
 * @since 31.08.2021
 * @version 1
 */

public class _1_2_StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
