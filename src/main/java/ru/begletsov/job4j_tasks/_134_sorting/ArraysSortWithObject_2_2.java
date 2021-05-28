package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Задание 2.2. Способы сортировки. Сортировка массива объектов
 * @Раздел 1.3.4. Сортировка
 * @Описание В утилитном классе Arrays есть метод для сортировки массива объектов void sort(массив, компаратор). Например,
 * - Integer[] data = {3, 2, 1};
 * - Arrays.sort(data, Comparator.naturalOrder()); // теперь массив станет {1, 2, 3}
 * Ваша задача отсортировать массив строк в убывающем порядке и вернуть его. Среди строк не null элементов
 * @author Sergei Begletsov
 * @since 28.05.2021
 * @version 1
 */

public class ArraysSortWithObject_2_2 {
    public static String[] sort(String[] data) {
        Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
