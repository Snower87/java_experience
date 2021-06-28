package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 13. Удалить первый и последний элемент
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для удаления первого и последнего элемента из связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 28.06.2021
 * @version 1
 */

public class _13_DelFirstAndLastElement {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //delete first and last elements the list
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("list: " + linkedList);
    }
}
