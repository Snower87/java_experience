package ru.begletsov.job4j_tasks._142_stream;

import java.util.List;

/**
 * @Задание 4.2. Терминальные операции. Метод allMatch()
 * @Раздел 1.4.2. Stream API
 * @Описание Чтобы проверить, что элементы стрима удовлетворяют определенному условию, мы можем использовать метод allMatch().
 * Например:
 * - List.of(1, 2, 3).allMatch(n -> n > 0); // проверяем, что все числа положительные
 * Ваша задача проверить, что переданный список содержит строки, длина которых больше 3.
 * @author Sergei Begletsov
 * @since 13.09.2021
 * @version 1
 */

public class _4_2_AllMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().allMatch(s -> s.length() > 3);
    }
}
