package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 6.2. Промежуточные операции. Метод filter(). Фильтрация строк
 * @Раздел 1.4.2. Stream API
 * @Описание Если условие громоздкое, то можно расположить несколько вызовов filter подряд.
 * Ваша задача отфильтровать список строк по следующему признаку.
 * Строка должна начинаться на "A" и заканчиваться на ".java"
 * @author Sergei Begletsov
 * @since 14.09.2021
 * @version 1
 */

public class _6_2_FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(str -> str.startsWith("A"))
                .filter(str -> str.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
