package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Задание 3. Перебор элементов с указанной позиции
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для перебора всех элементов в связанном списке, начиная с указанной позиции.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 27.06.2021
 * @version 1
 */

public class _3_IterateAtIndex {
    public static void main(String[] args) {
        //create list and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("grey");
        //set index 2 for iterator and print list them elements
        Iterator iterator = linkedList.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
