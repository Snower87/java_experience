package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 3. Добавить все элементы другой очереди
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java, чтобы добавить все элементы приоритетной очереди в другую приоритетную очередь.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 02.07.2021
 * @version 1
 */

public class _3_AddAllElements {
    public static void main(String[] args) {
        //create list1 and add some elements
        PriorityQueue<String> color1= new PriorityQueue<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        System.out.println("COLOR1: " + color1);
        //create list1 and add some elements
        PriorityQueue<String> color2= new PriorityQueue<>();
        //Add all elements color1
        System.out.println("COLOR2 BEFORE add all elements: " + color2);
        color2.addAll(color1);
        System.out.println("COLOR2 AFTER add all elements: " + color2);
    }
}
