package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @Задание 2. Вывод и перебор всех элементов
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите Java-программу для создания новой очереди приоритетов, добавьте несколько цветов (строку)
 * и распечатайте элементы очереди приоритетов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 02.07.2021
 * @version 1
 */

public class _2_IterateElements {
    public static void iterateMethodFirst() {
        System.out.println("First method iterate (for-each):");
        //create list and add some elements
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("111");
        priorityQueue.add("222");
        priorityQueue.add("333");
        //print the list
        for (String element:
                priorityQueue) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void iterateMethodSecond() {
        System.out.println("Second method iterate (iterator):");
        //create list and add some elements
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("white");
        priorityQueue.add("black");
        priorityQueue.add("orange");
        //print the list
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        iterateMethodFirst();
        iterateMethodSecond();
    }
}
