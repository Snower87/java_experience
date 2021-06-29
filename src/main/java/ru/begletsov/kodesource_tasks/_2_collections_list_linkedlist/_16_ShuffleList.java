package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @Задание 16. Перемешать все элементы
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java, чтобы перемешать элементы в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 29.06.2021
 * @version 1
 */

public class _16_ShuffleList {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print list before
        System.out.println("list: " + linkedList);
        //shuffle the list
        Collections.shuffle(linkedList);
        //print list after
        System.out.println("list: " + linkedList);
    }
}
