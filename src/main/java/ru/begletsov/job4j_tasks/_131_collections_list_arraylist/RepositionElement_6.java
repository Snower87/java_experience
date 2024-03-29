package ru.begletsov.job4j_tasks._131_collections_list_arraylist;

import java.util.List;

/**
 * @Задание 6. Удаление и замена элементов в списке
 * @Раздел 1.3.1. Коллекция List, ArrayList
 * @Описание Продолжим модифицировать список, познакомимся с методами для удаления элементов в списке и замены элемента
 * по индексу. Для этого предназначены методы set() и remove():
 * - E remove(int index) - удаляет элемент из списка по индексу index, при этом метод возвращает удаленный элемент.
 * - E set(int index, E e) - заменяет значение элемента, который имеет индекс index, значением e. При этом метод
 * возвращает старое значение элемента с индексом index.
 * Задание: метод принимает в качестве параметров список и индекс элемента который необходимо заменить. Необходимо
 * дописать метод так, чтобы сначала удалялся последний элемент в списке, а потом этим элементом заменить элемент
 * по индексу, который пришел в параметрах метода. Необходимо учесть, что извне могут передать индекс, который превышает
 * значение размера списка. Чтобы этого избежать - необходимо добавить проверку валидности входных параметров.
 * @author Sergei Begletsov
 * @since 04.05.2021
 * @version 1
 */

public class RepositionElement_6 {
    public static List<String> changePosition(List<String> list, int index) {
        String delElem = list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, delElem);
        }
        return list;
    }
}
