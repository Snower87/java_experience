package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Задание 2. Вывод и перебор всех элементов
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для перебора всех элементов в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 26.06.2021
 * @version 1
 */

public class _2_IterateElementsLinkList {
    public static void iterateMethodFirst() {
        System.out.println("First method iterate (for-each):");
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("111");
        linkedList.add("222");
        linkedList.add("333");
        //print the list
        for (String element:
                linkedList) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void iterateMethodSecond() {
        System.out.println("Second method iterate (iterator):");
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add(2, "grey");
        //print the list
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        iterateMethodFirst();
        iterateMethodSecond();
    }
}
