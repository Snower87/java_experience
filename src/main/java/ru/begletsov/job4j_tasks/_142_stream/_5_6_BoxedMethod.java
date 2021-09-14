package ru.begletsov.job4j_tasks._142_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 5.6. Промежуточные операции. Метод boxed()
 * @Раздел 1.4.2. Stream API
 * @Описание Если у нас стрим из примитивов, а мы хотим получим стрим из объектов оберток этого примитива,
 * то мы можем использовать метод boxed(). Например:
 * - List<Long> nums = Arrays.stream(new long[] {1, 2, 3}).boxed().collect(Collectors.toList());
 * Ваша задача получить список Integer из массива int[]
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _5_6_BoxedMethod {
    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data)
                .boxed()
                .collect(Collectors.toList());
    }
}
