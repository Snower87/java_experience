package ru.begletsov.job4j_tasks._134_sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Задание 2.6. Способы сортировки. Сортировка Collection. Сортировка через Set с использованием компаратора
 * @Раздел 1.3.4. Сортировка
 * @Описание Что делать если нам нужно получить отсортированный Set по определенному компаратору? Мы можем создать сет
 * с компаратором и добавить все элементы в сет. Например,
 * - List<Integer> list = List.of(1, 2, 3);
 * - Set<Integer> set = new TreeSet(Comparator.reverseOrder());
 * - set.addAll(list);
 * Ваша задача получить сет из списка с порядком по убыванию. Среди элементов нет null
 * @author Sergei Begletsov
 * @since 31.05.2021
 * @version 1
 */

public class SortBySetUsingComparator_2_6 {
    public static Set<String> sort(List<String> list) {
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);
        return set;
    }
}
