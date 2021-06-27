package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 8. Вставка элемента в конец списка (метод offerLast)
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для вставки указанного элемента в конец связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _8_OfferLast {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        //print list before
        System.out.println(linkedList);
        //add elements at last position
        linkedList.offerLast("grey");
        System.out.println("after add last element: " + linkedList.getLast());
        //print list after add
        System.out.println(linkedList);
    }
}
