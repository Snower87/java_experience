package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Задание 4. Итерация списка в обратном порядке
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для итерации связанного списка в обратном порядке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _4_IterateListByEndIndex {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("grey");
        //print list at reverse order
        Iterator reverseIterator = linkedList.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
