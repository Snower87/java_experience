package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @Задание 15. Поменять два элемента
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java, которая поменяет два элемента в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 29.06.2021
 * @version 1
 */

public class _15_SwapTwoElements {
    public static void SwapTwoElemVer1() {
        System.out.println("Swap ver.1:");
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //swap 2 elements
        String tempFirstElem = linkedList.getFirst();
        String currElem = linkedList.get(3);
        linkedList.set(0, currElem);
        linkedList.set(3, tempFirstElem);
        //print list after
        System.out.println("list: " + linkedList);
        System.out.println();
    }

    public static void SwapTwoElemVer2() {
        System.out.println("Swap ver.2:");
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //swap 2 elements
        Collections.swap(linkedList, 0, 3);
        //print list after
        System.out.println("list: " + linkedList);
    }

    public static void main(String[] args) {
        SwapTwoElemVer1();
        SwapTwoElemVer2();
    }
}
