package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 10. Получить первый и последний элемент
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java, чтобы получить первый и последний элемент из связанного списока.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _10_GetFirstAndLastElements {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //get first and last element
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Element at index 1: " + linkedList.get(1));
    }
}
