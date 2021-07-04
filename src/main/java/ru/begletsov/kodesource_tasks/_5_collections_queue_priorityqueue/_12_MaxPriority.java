package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Задание 12. Получить максимальное значение приоритета
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java, чтобы изменить priorityQueue на максимально приоритетный.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 04.07.2021
 * @version 1
 */

public class _12_MaxPriority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Comparator.naturalOrder()); //Collections.reverseOrder()
        // Add numbers in the Queue
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("Original priority queue: " + pq1);
        System.out.print("\nMaximum Priority Queue: \n");
        Integer val = 0;
        while ( (val = pq1.poll() ) != null) {
            System.out.println(val);
        }
    }
}
