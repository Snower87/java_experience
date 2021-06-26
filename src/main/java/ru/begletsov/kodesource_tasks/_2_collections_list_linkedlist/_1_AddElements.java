package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 1. Добавить элемент в конец связанного списка
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для добавления указанного элемента в конец связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 26.06.2021
 * @version 1
 */

public class _1_AddElements {
    public static void main(String[] args) {
        //create list1 and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("Pink");
        linkedList.add("White");
        //print list with index
        System.out.println(linkedList);
    }
}
