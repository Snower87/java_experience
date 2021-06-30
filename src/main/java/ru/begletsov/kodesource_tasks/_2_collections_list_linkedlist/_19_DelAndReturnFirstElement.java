package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 19. Удаление и возврат первого элемента
 * @Раздел Коллекция LinkedList
 * @Описание Напишите Java-программу для удаления и возврата первого элемента связанного списка.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 30.06.2021
 * @version 1
 */

public class _19_DelAndReturnFirstElement {
    public static void main(String[] args) {
        //create lists and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //print lists before
        System.out.println("list first: " + linkedList);
        //del and return first element
        linkedList.pollFirst();
        //print lists after pollFirst
        System.out.println("list (after pollFirst-method):" + linkedList);
        linkedList.removeFirst();
        //print lists after removeFirst
        System.out.println("list (after removeFirst-method):" + linkedList);
        linkedList.pop();
        //print lists after pop
        System.out.println("list (after pop-method): " + linkedList);
        //print lists after
        System.out.println("result list: " + linkedList);
    }
}
