package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;
import java.util.List;

/**
 * @Задание 2.3. Способы сортировки. Сортировка List
 * @Раздел 1.3.4. Сортировка
 * @Описание Класс List имеет метод sort(), который позволяет отсортировать элементы списка. Например,
 * - List<Integer> data = Arrays.asList(3, 2, 1);
 * - data.sort(Comparator.naturalOrder()); // Получим список из элементов 1, 2, 3
 * Ваша задача отсортировать список строк. В списке могут быть null элементы, они должны оказаться в конце после сортировки.
 * @author Sergei Begletsov
 * @since 28.05.2021
 * @version 1
 */

public class ListSort_2_3 {
    public static List<String> sort(List<String> data) {
        data.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return data;
    }
}
