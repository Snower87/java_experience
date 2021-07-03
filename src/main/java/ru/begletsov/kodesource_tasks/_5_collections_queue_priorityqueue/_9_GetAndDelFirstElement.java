package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 9. Получить и удалить первый элемент очереди
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java для извлечения и удаления первого элемента.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 03.07.2021
 * @version 1
 */

public class _9_GetAndDelFirstElement {
    public static void main(String[] args) {
        // Create Priority Queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(10);
        pq1.add(11);
        pq1.add(12);
        pq1.add(13);
        pq1.add(14);
        System.out.println("Original queue: " + pq1);
        System.out.println("Pool element from queue: " + pq1.poll());
        System.out.println("After pool element " + pq1);
    }
}
