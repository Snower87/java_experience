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
        return null;
    }

    //Удаление последнего элемента
    public DLink deleteLast() {
        return null;
    }

    //Вставка данных в позицию после ключа key
    public boolean insertAfter(int key, int data) {
        return false;
    }

    //Удаление элмента с заданным ключом
    public DLink deleteKey(int key) {
        return null;
    }

    //Вывод с начала списка
    public void displayForward() {
        System.out.println("<< Double Linked List: >>");
        System.out.println("       first -> last ");
        DLink current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }

    //Вывод с конца списка
    public void displayBackward() {
        System.out.println("<< Double Linked List: >>");
        System.out.println("       last -> first ");
        DLink current = last;
        while (current != null) {
            current.displayLinkX();
            current = current.previous;
        }
    }
}
