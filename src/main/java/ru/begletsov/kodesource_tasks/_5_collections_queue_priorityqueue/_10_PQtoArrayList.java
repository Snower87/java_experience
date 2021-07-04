package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Задание 10. Преобразовать очередь в массив
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите Java-программу для преобразования приоритетной очереди в массив, содержащий все элементы очереди.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 04.07.2021
 * @version 1
 */

public class _10_PQtoArrayList {
    public static void main(String[] args) {
        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.offer("Red");
        pq1.offer("White");
        pq1.offer("Black");
        pq1.add("Orange");
        System.out.println("Original queue: " + pq1);
        // Create Array List from collection pq1
        List<String> list = new ArrayList<>(pq1);
        System.out.println("Convert to Array List: " + list);
        list.remove("Black");
        System.out.println("After remove element: " + list);
    }
}
