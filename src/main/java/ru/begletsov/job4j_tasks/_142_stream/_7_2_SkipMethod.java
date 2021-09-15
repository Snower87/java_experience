package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 7.2. Промежуточные операции. Метод skip()
 * @Раздел 1.4.2. Stream API
 * @Описание Чтобы опустить какое-то число элементов стрима, можно использовать метод skip()
 * Например:
 * - List.of(1, 2, 3, 4, 5).stream().skip(2) // будет стрим из элементов 3, 4, 5
 * Ваша задача взять и получить элементы списка, за исключением первых двух
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _7_2_SkipMethod {
    public static List<String> lastThree(List<String> strings) {
        return strings.stream()
                .skip(2)
                .collect(Collectors.toList());
    }
}
