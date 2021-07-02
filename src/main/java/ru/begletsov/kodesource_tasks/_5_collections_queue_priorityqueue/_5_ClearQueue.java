package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.PriorityQueue;

/**
 * @Задание 5. Удалить все элементы из приоритетной очереди
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите программу на Java, чтобы удалить все элементы из очереди с приоритетами.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 02.07.2021
 * @version 1
 */

public class _5_ClearQueue {
    public static void main(String[] args) {
        //create and add() method to add values in the Priority Queue
        PriorityQueue<String> color1= new PriorityQueue<>();
        color1.add("Red");
        color1.add("Green");
        color1.add("Black");
        color1.add("Pink");
        //print the queue
        System.out.println("COLOR1 BEFORE: " + color1);
        //print the queue after clear queue
        color1.clear();
        System.out.println("COLOR1 AFTER:  " + color1);
    }
}
