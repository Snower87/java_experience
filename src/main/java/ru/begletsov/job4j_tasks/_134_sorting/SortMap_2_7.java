package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Задание 2.7. Способы сортировки. Сортировка Collection. Сортировка Map через компаратор
 * @Раздел 1.3.4. Сортировка
 * @Описание Методов сортировки Map нет. Мы можем только получить отсортированную мапу через создание новой из исходной.
 * При данном подходе упорядочивание происходит аналогично как через Set. Например,
 * - Map<Integer, Integer> map = new TreeMap<>(Map.of(2, 4, 1, 1)); // получим пары (1, 1), (2, 4) произошло упорядочивание
 * в естественном порядке
 * Ваша задача получить отсортированную мапу из исходной. Сортировка должна быть в обратном порядке
 * @author Sergei Begletsov
 * @since 31.05.2021
 * @version 1
 */

public class SortMap_2_7 {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        Map<Integer, String> rsl = new TreeMap<>(Comparator.reverseOrder());
        rsl.putAll(map);
        return rsl;
    }
}
