package ru.begletsov.job4j_tasks._142_stream;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Задание 1.3. Создание стрима из массива. Метод Arrays.stream()
 * @Раздел 1.4.2. Stream API
 * @Описание Массивы это часто используемая конструкция, поэтому важно знать как создать стрим из массива.
 * Для создания стрима служит метод Arrays.stream(). Например:
 * Integer[] data = {1, 2, 3};
 * Stream<Integer> stream = Arrays.stream(data);
 * Ниже приведен код, вам нужно создать стрим из переданного массива
 * @author Sergei Begletsov
 * @since 01.09.2021
 * @version 1
 */

public class _1_3_ArraysStreamMethod {
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
