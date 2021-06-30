package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 18. Клонирование списка
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для клонирования связанного списка в другой связанный список.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 30.06.2021
 * @version 1
 */

public class _18_CloneList {
    public static void main(String[] args) {
        //create lists and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print lists
        System.out.println("list1: " + linkedList);
        //clone list
        LinkedList<String> list2 = new LinkedList<>();
        list2 = (LinkedList) linkedList.clone();
        //print lists
        System.out.println("list2-cloned: " + list2);
    }
}
