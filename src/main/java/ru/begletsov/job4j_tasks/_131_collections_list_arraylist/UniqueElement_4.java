package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import java.util.List;

/**
 * @Задание 4. Найти индекс элемента
 * @Раздел 1.3.1. Коллекция List, ArrayList
 * @Описание Рассмотрим очень интересные методы, которые позволяют найти индекс определенного элемента. Первый метод indexOf(E e):
 *   - int indexOf(E e) - метод возвращает индекс элемента E при его первом вхождении в список. Если элемент не найден,
 *  то метод возвращает -1.
 * Что же делать если мы хотим найти индекс элемента при его последнем вхождении (т.е. у нас в коллекции есть дубликаты)?
 * Нет никаких проблем, можно использовать lastIndexOf(E e):
 *  - int lastIndexOf(E e) - метод возвращает индекс элемента E при его последнем вхождении в список. Если элемент не найден,
 *  то метод возвращает -1.
 * Необходимо указать, что эти методы реализованы с помощью цикла for(), поэтому применять эти методы внутри циклов,
 * которые перебирают список, нежелательно, поскольку так мы будем проходить по одному и тому же списку дважды.
 * Задание: метод принимает список и элемент который мы ищем в списке. Необходимо определить, является ли этот элемент
 * уникальным в этом списке. Для это необходимо найти первый и последний индекс вхождения элемента.
 * Если равны - значит элемент уникальный. Необходимо предусмотреть ситуацию, что такого элемента нет вообще в коллекции,
 * в этом случае также нужно вернуть false.
 * @author Sergei Begletsov
 * @since 03.05.2021
 * @version 1
 */

public class UniqueElement_4 {
    public static boolean checkList(List<String> list, String str) {
        int firstIndex = list.indexOf(str);
        int lastIndex = list.lastIndexOf(str);
        if (firstIndex != -1 && lastIndex != -1) {
            if (firstIndex == lastIndex) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
