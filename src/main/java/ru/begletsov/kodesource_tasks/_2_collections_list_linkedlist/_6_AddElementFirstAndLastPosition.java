package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 6. Вставка элемента в начало и конец списка
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для вставки элементов в связанный список в первой и последней позиции.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _6_AddElementFirstAndLastPosition {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        //print list before
        System.out.println(linkedList);
        //add element at first position
        linkedList.addFirst("grey");
        System.out.println("add first element: " + linkedList.getFirst());
        System.out.println(linkedList);
        //add element at last position
        linkedList.addLast("blue");
        System.out.println("add last element: " + linkedList.getLast());
        System.out.println(linkedList);
    }
}
