package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 9. Вставка другого списка по индексу
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для вставки некоторых элементов в указанной позиции в связанный список.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _9_AddOtherListByIndex {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        //print list before
        System.out.println("list before: " + linkedList);
        //create other list
        LinkedList<String> newLinkList = new LinkedList<>();
        newLinkList.add("grey");
        newLinkList.add("blue");
        linkedList.addAll(1, newLinkList);
        //print list after add
        System.out.println("list after : " + linkedList);
    }
}
