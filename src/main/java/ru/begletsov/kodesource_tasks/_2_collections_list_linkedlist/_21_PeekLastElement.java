package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 21. Извлечение, но не удаление, последнего элемента
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для извлечения, но не удаления, последнего элемента связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 30.06.2021
 * @version 1
 */

public class _21_PeekLastElement {
    public static void main(String[] args) {
        //create lists and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print lists before
        System.out.println("list: " + linkedList);
        //retrieve but does not remove, the last element of a linked list
        String peekElement = linkedList.peekLast();
        System.out.println("first element: " + peekElement);
        //print lists after
        System.out.println("list: " + linkedList);
    }
}
