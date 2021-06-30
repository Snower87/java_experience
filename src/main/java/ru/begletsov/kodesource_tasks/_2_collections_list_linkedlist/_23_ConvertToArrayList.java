package ru.begletsov.kodesource_tasks._2_collections_list_linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Задание 23. Преобразование списка в список массивов
 * @Раздел Коллекция LinkedList
 * @Описание Напишите программу на Java для преобразования связанного списка в список массивов.
 * ссылка на задание: http://kodesource.top/java-exercises/collection/index.php
 * @author Sergei Begletsov
 * @since 30.06.2021
 * @version 1
 */

public class _23_ConvertToArrayList {
    public static void main(String[] args) {
        //create lists and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("white");
        linkedList.add("black");
        linkedList.add("orange");
        linkedList.add("blue");
        //convert a linked list to array list
        List<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("arrayList: " + arrayList);

        String[] massList = arrayList.toArray(new String[0]);
        System.out.print("mass: ");
        for (String mass:
             massList) {
            System.out.print(mass + " ");
        }
    }
}