package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;

/**
 * @Задание 4.4. Терминальные операции. Метод noneMatch()
 * @Раздел 1.4.2. Stream API
 * @Описание Чтобы проверить, что ни один элемент стрима не удовлетворяет условию можно использовать метод noneMatch()
 * Например:
 * - List.of(1, 2, 3).stream().noneMatch(n -> n == 0); // проверяем, что нет нулей
 * Ваша задача проверить, что в списке нет пустых строк
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _4_4_NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(s -> s.isEmpty());
    }
}
