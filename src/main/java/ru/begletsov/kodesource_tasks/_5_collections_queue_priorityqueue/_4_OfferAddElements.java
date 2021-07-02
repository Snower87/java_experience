package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 4. Вставить элементы в приоритетную очередь
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java, чтобы добавить все элементы приоритетной очереди в другую приоритетную очередь.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 02.07.2021
 * @version 1
 */

public class _4_OfferAddElements {
    public static void main(String[] args) {
        //create and add() method to add values in the Priority Queue
        PriorityQueue<String> color1= new PriorityQueue<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        //print the queue
        System.out.println("COLOR1 BEFORE: " + color1);
        //print the queue after add element
        color1.offer("Orange");
        color1.offer("Grey");
        System.out.println("COLOR1 AFTER:  " + color1);
    }
}
