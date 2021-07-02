package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 6. Размер приоритетной очереди
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите Java-программу для подсчета количества элементов в приоритетной очереди.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 02.07.2021
 * @version 1
 */

public class _6_SizeQueue {
    public static void main(String[] args) {
        //create and add() method to add values in the Priority Queue
        PriorityQueue<String> priorityQueue= new PriorityQueue<>();
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Black");
        priorityQueue.add("Pink");
        //print the queue
        System.out.println("COLOR1: " + priorityQueue);
        //print the queue size
        System.out.println("COLOR1 (size) = " + priorityQueue.size());
    }
}
