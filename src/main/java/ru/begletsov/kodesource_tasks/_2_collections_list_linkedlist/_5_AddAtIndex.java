package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 5. Вставка элемента по индексу
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для вставки указанного элемента в указанную позицию в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _5_AddAtIndex {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("grey");
        //print list before add elements at index 0
        System.out.println(linkedList);
        //print list after
        linkedList.add(0, "blue");
        System.out.println(linkedList);
    }
}
