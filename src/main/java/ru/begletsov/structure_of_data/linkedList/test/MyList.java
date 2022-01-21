package ru.begletsov.structure_of_data.linkedList.test;

/**
 * @Задание Создание и разбор алгоритма работы односвязанного списка
 * @author Sergei Begletsov
 * @since 21.01.22
 * @version 1
 */

public class MyList {
    private ListElement head; //ссылка на первый элмент
    private ListElement tail; //ссылка на последний элмент

    public void addFirst(int data) {
        ListElement element = new ListElement();
        element.data = data;
        if (head == null) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }

    public void addLast(int data) {
        ListElement element = new ListElement();
        element.data = data;
        if (tail == null) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
        }
    }

    public void printList() {
        ListElement element = head;
        while (element != null) {
            System.out.println(element.data);
            element = element.next;
        }
    }
}
