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

    }

    //Вставка элемента в конец списка
    public void insertLast(int data) {

    }

    //Удаление первого элемента
    public DLink deleteFirst() {

    }

    //Удаление последнего элемента
    public DLink deleteLast() {

    }

    //Вставка данных в позицию после ключа key
    public boolean insertAfter(int key, int data) {

    }

    //Удаление элмента с заданным ключом
    public DLink deleteKey(int key) {

    }

    //Вывод с начала списка
    public void displayForward() {
        System.out.println("<< Double Linked List: >>");
        System.out.println("       first -> last ");
    }

    //Вывод с конца списка
    public void displayBackward() {
        System.out.println("<< Double Linked List: >>");
        System.out.println("       last -> first ");
    }
}
