package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 7. Сравнение двух очередей
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите Java-программу для сравнения двух приоритетных очередей.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 03.07.2021
 * @version 1
 */

public class _7_CompareTwoQueue {
    public static void main(String[] args) {
        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        // use add() method to add values in the Priority Queue
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("First Priority Queue: " + pq1);
        PriorityQueue<String> pq2 = new PriorityQueue<String>();
        pq2.add("Red");
        pq2.add("Pink");
        pq2.add("Black");
        pq2.add("Orange");
        System.out.println("Second Priority Queue: " + pq2);
        //comparison two queue
        for (String color:
             pq2) {
            System.out.println(pq1.contains(color) ? "yes, contains " + color : "no, not contains " + color);
        }
    }
}
