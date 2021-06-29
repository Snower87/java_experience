package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @Задание 17. Объединить два списка
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java, чтобы объединить два связанных списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 29.06.2021
 * @version 1
 */

public class _17_JoinTwoList {
    public static void main(String[] args) {
        //create lists and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        LinkedList<String> list = new LinkedList<>();
        list.add("list_1");
        list.add("list_2");
        list.add("list_3");
        list.add("list_4");
        //print lists before
        System.out.println("list1: " + linkedList);
        System.out.println("list2: " + list);
        //add all elements to listResult
        LinkedList<String> listResult = new LinkedList<>();
        listResult.addAll(linkedList);
        listResult.addAll(list);
        //print list result after add all elements from 2 lists
        System.out.println("listResult: " + listResult);
    }
}
