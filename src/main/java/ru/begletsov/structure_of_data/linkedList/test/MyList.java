package ru.begletsov.structure_of_data.linkedList.test;

/**
 * @Задание Создание и разбор алгоритма работы односвязанного списка
 * @author Sergei Begletsov
 * @since 21.01.22
 * @version 4
 */

public class MyList {
    private ListElement head; //ссылка на первый элемент
    private ListElement tail; //ссылка на последний элемент

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        return tail.data;
    }

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
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null)
            return;
        ListElement el = head.next;
        head = null;
        head = el;
    }

    public void deleteLast() {
        if (tail == null)
            return;
        ListElement el = head;
        while (el != null) {
            ListElement elNext = el.next;
            if (elNext == tail) {
                //tail.next = elNext;
                tail = el;
                tail.next = null;
                break;
            }
            el = elNext;
        }
    }

    public void removeCurrValue(int data) {
        if (head == null)
            return;
        ListElement el = head;
        while (el.next != null) {
            if (el.next.data == data) {
                el.next = el.next.next;
                break;
            }
            el = el.next;
        }
    }

    public int getSize() {
        int size = 0;
        ListElement el = head;
        while (el != null) {
            size++;
            el = el.next;
        }
        return size;
    }

    public int getByIndex(int index) {
        int rsl = -1;
        if (index < 0 & index >= getSize())
            return rsl;
        ListElement el = head;
        int tempIndex = 0;
        while (el != null) {
            if (tempIndex == index) {
                rsl = el.data;
                break;
            }
            tempIndex++;
            el = el.next;
        }
        return rsl;
    }
}
