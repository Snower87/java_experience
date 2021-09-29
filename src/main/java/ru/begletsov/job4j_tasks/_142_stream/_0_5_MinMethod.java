package ru.begletsov.job4j_tasks._142_stream;

import java.util.Comparator;
import java.util.List;

/**
 * @Задание 0.5. Понятие редукции. Метод min(). Поиск кратчайшей строки
 * @Раздел 1.4.2. Stream API
 * @Описание Как вы наверное уже догадались поиск минимального элемента представляет собой также редукцию. Этот метод
 * принимает Comparator и возвращает Optional. Если список пуст вернется пустой Optional.
 * Пример:
 * - Integer min = List.of(3, 2, 1).stream().min((n1, n2) -> Integer.compare(n1, n2)).get(); // вернет 1
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 * @author Sergei Begletsov
 * @since 29.09.2021
 * @version 1
 */

public class _0_5_MinMethod {
    public static String min(List<String> list) {
        return list.stream()
                .min(Comparator.naturalOrder())
                //.min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .get();
    }
}
