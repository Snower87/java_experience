package ru.begletsov.kodesource_tasks._5_collections_queue_priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Задание 1. Добавить элементы в очередь приоритетов
 * @Раздел Коллекция PriorityQueue
 * @Описание Напишите Java-программу для создания новой очереди приоритетов, добавьте несколько цветов (строку)
 * и распечатайте элементы очереди приоритетов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 02.07.2021
 * @version 1
 */

public class _1_AddElements {
    public static void addIntegerElements() {
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        integerPriorityQueue.add(100);
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(12);
        integerPriorityQueue.add(33);
        integerPriorityQueue.add(95);
        //print list with index
        System.out.println(integerPriorityQueue);
    }

    public static void addStringElements() {
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("Red");
        stringPriorityQueue.add("Green");
        stringPriorityQueue.add("Black");
        stringPriorityQueue.add("Pink");
        stringPriorityQueue.add("White");
        //print list with index
        System.out.println(stringPriorityQueue);
    }

    public static void main(String[] args) {
        addIntegerElements();
        addStringElements();
    }
}
