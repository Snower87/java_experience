package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * @Задание 9. Получить часть списка с определенными индексами
 * @Раздел 1.3.1. Коллекция List, ArrayList
 * @Описание Может возникнуть ситуация, когда у нас есть список и нам нужно получить его часть, которая находится
 * между двумя интересующими нас индексами. Что же делать в данной ситуации? Не отчаиваться, не усложнять, а просто
 * применить метод subList():
 * - List<E> subList(int fromIndex, int toIndex) - метод возвращает список, который содержит все элементы исходного списка
 * начиная с индекса fromIndex(включительно) и до toIndex(значение исключается). При этом, если выполняется условие
 * fromIndex == toIndex,- метод вернет пустой список.
 * Задание: метод принимает два параметра - список и элемент, который предполагается, что содержится в этом списке.
 * Необходимо реализовать метод, чтобы он возвращал результаты следующим образом:
 * 1. Элемента нет в списке - возвращает пустой список.
 * 2. Элемент в списке встречается 1 раз - возвращает пустой список.
 * 3. Элемент встречается более одного - возвращается список, начиная с первого вхождения элемента и заканчивая
 * предшествующим последнему вхождению элемента в исходной коллекции.
 * @author Sergei Begletsov
 * @since 05.05.2021
 * @version 1
 */

public class SubList_9 {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (list.contains(el)) {
            int firstIndex = list.indexOf(el);
            int lastIndex = list.lastIndexOf(el);
            if (firstIndex != lastIndex) {
                return list.subList(firstIndex, lastIndex);
            }
        }
        return new ArrayList<>();
    }
}
