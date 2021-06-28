package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 14. Очистить список
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java, чтобы удалить все элементы из связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 28.06.2021
 * @version 1
 */

public class _14_ClearList {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //clear list and print
        linkedList.clear();
        System.out.println("list size: " + linkedList.size() + " elements, " +"list: " + linkedList);
        System.out.println();
    }
}
