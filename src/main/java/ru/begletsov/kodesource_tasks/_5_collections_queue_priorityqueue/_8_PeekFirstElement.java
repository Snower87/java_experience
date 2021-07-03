package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Задание 8. Получить первый элемент очереди
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java, чтобы получить первый элемент очереди с приоритетами.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 03.07.2021
 * @version 1
 */

public class _8_PeekFirstElement {
    public static void main(String[] args) {
        // Create Priority Queue
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.naturalOrder());
        pq1.add(10);
        System.out.println("Original queue: " + pq1);
        pq1.add(11);
        System.out.println("Original queue: " + pq1);
        //pq1.add(33);
        pq1.add(12);
        System.out.println("Original queue: " + pq1);
        //pq1.add(25);
        pq1.add(13);
        System.out.println("Original queue: " + pq1);
        //pq1.add(19);
        pq1.add(14);
        System.out.println("Original queue: " + pq1);
        //pq1.add(26);
        pq1.add(15);
        System.out.println("Original queue: " + pq1);
        //pq1.add(34);
        pq1.add(16);
        System.out.println("Original queue: " + pq1);
        System.out.println("First element: " + pq1.peek());
    }
}
