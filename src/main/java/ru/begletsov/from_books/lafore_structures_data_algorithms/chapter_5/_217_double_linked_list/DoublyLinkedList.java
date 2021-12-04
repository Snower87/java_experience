package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._217_double_linked_list;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.DLink;

public class DoublyLinkedList {
    private DLink first;
    private DLink last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    //Вставка элемента в начало списка
    public void insertFirst(int data) {
        System.out.println("insertFirst -> " + data);
        DLink newLink = new DLink(data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    //Вставка элемента в конец списка
    public void insertLast(int data) {
        System.out.println("insertLast -> " + data);
        DLink newLink = new DLink(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        newLink.previous = last;
        last = newLink;
    }

    //Удаление первого элемента
    public DLink deleteFirst() {
        DLink temp = first;
        System.out.println("deleteFirst -> " + temp.iData);
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    //Удаление последнего элемента
    public DLink deleteLast() {
        DLink temp = last;
        System.out.println("deleteLast -> " + temp.iData);
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    //Вставка данных в позицию после ключа key
    public boolean insertAfter(int key, int data) {
        DLink current = first;
        while (current.iData != key) {
            current = current.next;
            if (current == null) {
                System.out.println("insertAfter -> " + false);
                return false;
            }
        }
        DLink newLink = new DLink(data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
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
        DLink current = first;
        System.out.println("deleteKey -> " + key);
        while (current.iData != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    //Вывод с начала списка
    public void displayForward() {
        System.out.println("sout first -> last << Double Linked List: >>");
        DLink current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }

    //Вывод с конца списка
    public void displayBackward() {
        System.out.println("sout last -> first << Double Linked List: >>");
        DLink current = last;
        while (current != null) {
            current.displayLinkX();
            current = current.previous;
        }
    }
}
