package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._217_double_linked_list;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.DLink;

public class DoublyLinkedList {
    private DLink head;
    private DLink tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //Вставка элемента в начало списка
    public void insertFirst(int data) {
        System.out.println("insertFirst -> " + data);
        DLink el = new DLink(data);
        if (isEmpty()) {
            tail = el;
        } else {
            head.previous = el;
        }
        el.next = head;
        head = el;
    }

    //Вставка элемента в конец списка
    public void insertLast(int data) {
        System.out.println("insertLast -> " + data);
        DLink el = new DLink(data);
        if (isEmpty()) {
            head = el;
        } else {
            tail.next = el;
        }
        el.previous = tail;
        tail = el;
    }

    //Удаление первого элемента
    public DLink deleteFirst() {
        DLink temp = head;
        System.out.println("deleteFirst -> " + temp.iData);
        if (head.next == null) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        return temp;
    }

    //Удаление последнего элемента
    public DLink deleteLast() {
        DLink temp = tail;
        System.out.println("deleteLast -> " + temp.iData);
        if (head.next == null) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        return temp;
    }

    //Вставка данных в позицию после ключа key
    public boolean insertAfter(int key, int data) {
        DLink current = head;
        while (current.iData != key) {
            current = current.next;
            if (current == null) {
                System.out.println("insertAfter -> " + false);
                return false;
            }
        }
        DLink newLink = new DLink(data);
        if (current == tail) {
            newLink.next = null;
            tail = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        System.out.println("insertAfter -> " + true);
        return true;
    }

    //Удаление элмента с заданным ключом
    public DLink deleteKey(int key) {
        DLink current = head;
        System.out.println("deleteKey -> " + key);
        while (current.iData != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == head) {
            head = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == tail) {
            tail = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    //Вывод с начала списка
    public void displayForward() {
        System.out.println("sout first -> last << Double Linked List: >>");
        DLink current = head;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }

    //Вывод с конца списка
    public void displayBackward() {
        System.out.println("sout last -> first << Double Linked List: >>");
        DLink current = tail;
        while (current != null) {
            current.displayLinkX();
            current = current.previous;
        }
    }
}
