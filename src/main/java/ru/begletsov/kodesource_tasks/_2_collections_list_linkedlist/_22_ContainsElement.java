package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.LinkedList;

/**
 * @Задание 22. Существует ли элемент?
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java, чтобы проверить, существует ли определенный элемент в связанном списке.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 30.06.2021
 * @version 1
 */

public class _22_ContainsElement {
    public static void main(String[] args) {
        //create lists and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");

        // Checks the color "white" exists or not.
        if (linkedList.contains("white")) {
            System.out.println("color white is present in the linked list.");
        } else {
            System.out.println("color white NOT present in the linked list.");
        }

        // Checks the color "white" exists or not.
        if (linkedList.contains("blue2")) {
            System.out.println("color blue2 is present in the linked list.");
        } else {
            System.out.println("color blue2 NOT present in the linked list.");
        }
    }
}
