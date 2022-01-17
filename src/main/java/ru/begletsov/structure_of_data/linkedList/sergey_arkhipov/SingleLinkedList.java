package ru.begletsov.structure_of_data.linkedList.sergey_arkhipov;

import java.util.Iterator;

/**
 * @Задание Создание и разбор алгоритма работы односвязанного списка (Sergey Arkhipov Java Tutorials)
 * @Описание Структуры данных. Односвязный список
 *           ссылка на видео: https://www.youtube.com/watch?v=Nzz4i1QWmJw
 * @author Sergei Begletsov
 * @since 17.01.2022
 * @version 1
 */

public class SingleLinkedList<T> implements Iterable {

    ListItem<T> head;
    ListItem<T> tail;

    @Override
    public Iterator iterator() {
        return new Iterator() {
            ListItem<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Object next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private static class ListItem<T> {
        T data;
        ListItem<T> next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToEnd(T item) {
        ListItem<T> newItem = new ListItem<>();
        newItem.data = item;
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            tail.next = newItem;
            tail = newItem;
        }
    }
}
