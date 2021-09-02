package ru.begletsov.job4j_tasks._142_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Задание 1.6. Создание стрима примитивов. Метод Arrays.stream()
 * @Раздел 1.4.2. Stream API
 * @Описание Класс Stream работает с объектами. Для представления стрима примитивов в Java есть свои классы:
 * IntStream, LongStream, DoubleStream.
 * Их можно создавать как мы создавали раньше. Чаще всего приходиться создавать стрим из массива примитивов.
 * Для этого лучше всего подходит метод Arrays.stream(). Например:
 * - int[] data = {1, 2, 3};
 * - IntStream steam = Arrays.stream(data);
 * Ваша задача создать стрим из переданного массива
 * @author Sergei Begletsov
 * @since 02.09.2021
 * @version 1
 */

public class _1_6_ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
