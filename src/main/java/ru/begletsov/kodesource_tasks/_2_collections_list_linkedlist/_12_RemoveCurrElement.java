package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 12. Удалить указанный элемент
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для удаления указанного элемента из связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 28.06.2021
 * @version 1
 */

public class _12_RemoveCurrElement {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //revome element and print list
        linkedList.remove("orange");
        linkedList.remove(2);
        System.out.println("list: " + linkedList);
    }
}
