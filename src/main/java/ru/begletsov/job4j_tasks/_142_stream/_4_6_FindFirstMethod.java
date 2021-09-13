package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;
import java.util.Optional;

/**
 * @Задание 4.6. Терминальные операции. Метод findFirst()
 * @Раздел 1.4.2. Stream API
 * @Описание Для получения элемента из стрима можно использовать метод findFirst(). Этот метод возвращает Optional.
 * Если стрим пустой, то вернется пустой Optional, а если не пустой то вернется Optional из первого элемента стрима
 * Например:
 * - Optinal<Integer> o1 = List.of().stream().findFirst(); // o1.isEmpty() == true
 * - Optinal<Integer> o2 = List.of(1).stream().findFirst(); // o1.get() == 1
 * Ваша задача получить первый элемент стрима списка
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _4_6_FindFirstMethod {
    public static Optional<Integer> first(List<Integer> list) {
        return list.stream().findFirst();
    }
}
