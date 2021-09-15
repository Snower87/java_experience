package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 7.1. Промежуточные операции. Метод limit()
 * @Раздел 1.4.2. Stream API
 * @Описание Чтобы взять какое-то число первых элементов стрима, можно использовать метод limit()
 * Например,
 * - List.of(1, 2, 3, 4, 5).stream().limit(2) // будет стрим из элементов 1, 2
 * Ваша задача взять первые 3 элемента из списка
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _7_1_LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}
