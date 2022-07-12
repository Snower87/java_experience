package ru.begletsov.structure_of_data.linkedList.test;

/**
 * @Задание Создание и разбор алгоритма работы односвязанного списка
 * @author Sergei Begletsov
 * @since 21.01.22
 * @version 3
 */

public class MyList {
    private ListElement head; //ссылка на первый элемент
    private ListElement tail; //ссылка на последний элемент

    public void addFirst(int data) {
        ListElement el = new ListElement();
        el.data = data;
        if (head == null) {
            head = el;
            tail = el;
        } else {
            el.next = head;
            head = el;
        }
    }

    public void addLast(int data) {
        ListElement b = new ListElement();
        b.data = data;
        if (tail == null) {
            head = b;
            tail = b;
        } else {
            tail.next = b;
            tail = b;
        }
    }

    public void printList() {
        ListElement el = head;
        while (el != null) {
            System.out.print(el.data + " ");
            el = el.next;
        }
    }
}
