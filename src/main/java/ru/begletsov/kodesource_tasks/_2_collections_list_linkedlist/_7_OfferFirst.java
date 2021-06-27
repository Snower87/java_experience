package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 7. Вставка элемента в начало списка (метод offerFirst)
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для вставки указанного элемента в начало связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _7_OfferFirst {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        //print list before
        System.out.println(linkedList);
        //add elements at first position
        linkedList.offerFirst("grey");
        System.out.println("add first element: " + linkedList.getFirst());
        //print list after add
        System.out.println(linkedList);
    }
}
