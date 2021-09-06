package ru.begletsov.job4j_tasks._142_stream;

import java.util.stream.IntStream;

/**
 * @Задание 1.7. Создание стрима примитивов. Методы range() и rangeClosed()
 * @Раздел 1.4.2. Stream API
 * @Описание Стримы целых чисел (IntStream, LongSteam) имеют также еще один способ создания стрима.
 * Это методы range(int start, int end) и rangeClosed(int start, int end)
 * Первый метод, создает стрим в диапозоне [start, end)
 * Второй метод, создает стрим в диапозоне [start, end]
 * Пример:
 * - IntStream.range(1, 5) => [1, 2, 3, 4]
 * - IntStream.rangeClosed(1, 5) => [1, 2, 3, 4, 5]
 * Ваша задача создать стрим с использованием метода rangeClosed()
 * @author Sergei Begletsov
 * @since 06.09.2021
 * @version 1
 */

public class _1_7_RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
