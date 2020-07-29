package ru.begletsov.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Class iteratorListCollection перебор коллекции List (4 варианта): через for, Iterator, Stream.
 * 1) создание класса 2) дополнил варианты итерации
 * @author Sergei Begletsov
 * @since 29.07.2020
 * @version 2
 */

public class iteratorListCollection {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(20);
        lists.add(19);
        lists.add(18);
        lists.add(22);

        //===============================================
        //   Перебор всех элементов через цикл for
        //              << 1-2 Вариант >>
        //===============================================

        //1 Вариант через цикл for
        System.out.println();
        System.out.println("1 Вариант. Обход всех элементов через цикл for:");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        //2.1 Вариант через цикл for
        System.out.println();
        System.out.println("2.1 Вариант. Обход всех элементов через цикл for:");
        for (Object value: lists) {
           System.out.println(value);
        }

        //2.2 Вариант через цикл for
        System.out.println();
        System.out.println("2.2 Вариант. Обход всех элементов через цикл for:");
        for (Integer value: lists) {
            System.out.println(value);
        }

        //===============================================
        //   Перебор всех элементов через итератор
        //              << 3 Вариант >>
        //===============================================

        //3.1 Вариант обхода через Iterator
        System.out.println();
        System.out.println("3.1 Вариант. Обход через Iterator:");
        Iterator iterator = lists.iterator();
        try {
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {};

        //3.2 Вариант обхода через Iterator
        System.out.println();
        System.out.println("3.2 Вариант. Обход через Iterator:");
        for (Iterator<Integer> iterator2 = lists.iterator(); iterator2.hasNext();) {
            System.out.println(iterator2.next());
        }

        //3.3 Вариант обхода через ListIterator
        System.out.println();
        System.out.println("3.3 Вариант. Обход через ListIterator:"); //может ходить в обе стороны: hasNext, hasPrevious, next, previous
        ListIterator iterator3 = lists.listIterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
        iterator3.set(33); //итератор находится на последнем элементе,
        //меняю последнее значение 22 -> 33
        System.out.println();
        while (iterator3.hasPrevious()) {
            System.out.println(iterator3.previous());
        }

        //3.4 Вариант обхода через Iterator
        System.out.println();
        System.out.println("3.3 Вариант. Обход через ListIterator:"); //может ходить в обе стороны: hasNext, hasPrevious, next, previous
        ListIterator iterator4 = lists.listIterator();

        //===============================================
        //   Перебор всех элементов через Stream
        //              << 4 Вариант >>
        //===============================================
        System.out.println();
        System.out.println("4 Вариант. Обход через Stream:");
        lists.stream()
                //.forEach(System.out::print);
                .forEach(c -> System.out.println(c));
    }
}
