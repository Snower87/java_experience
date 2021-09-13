package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Задание 5.2. Промежуточные операции. Метод map(). Map со строками
 * @Раздел 1.4.2. Stream API
 * @Описание Дан список строк. Вам нужно к каждой строке прибавить ".java"
 * Например,
 * Из {"One"} нужно получить {"One.java"}
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _5_2_StringMap {
    public static List<String> map(List<String> names) {
        return names.stream().map(s -> s.concat(".java")).collect(Collectors.toList());
    }
}
