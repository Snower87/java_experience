package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 11. Преобразовать очередь в строку
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java для преобразования элементов Priority Queue в строковое представление.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 04.07.2021
 * @version 1
 */

public class _11_toString {
    public static void main(String[] args) {
        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.offer("Red");
        pq1.offer("White");
        pq1.offer("Black");
        pq1.add("Orange");
        String string = pq1.toString();
        //String representation of the Priority Queue
        System.out.println("pq1 -> to String: " + string);
    }
}
