package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;

/**
 * @Задание 4.3. Терминальные операции. Метод anyMatch()
 * @Раздел 1.4.2. Stream API
 * @Описание Чтобы проверить, что хотя бы один элемент стрима удовлетворяет условию, можно использовать метод anyMatch().
 * Например:
 * - List.of(1, 2, 0, 3, 4).stream().anyMatch(n -> n % 2 == 0); // проверяем, что есть хотя бы одно четное число
 * Ваша задача проверить, что хотя бы одна строка списка начинается с "job4j"
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _4_3_AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream().anyMatch(s -> s.contains("job4j"));
    }
}
