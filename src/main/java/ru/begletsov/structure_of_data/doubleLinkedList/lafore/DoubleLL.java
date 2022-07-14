package ru.begletsov.structure_of_data.doubleLinkedList.lafore;

public class DoubleLL {
    DLink head;
    DLink tail;

    public DoubleLL() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //Вставка элемента в начало списка
    public void insertFirst(int data) {
        System.out.println("insert first -> " + data);
        DLink e = new DLink(data);
        if (head == null) {
            head = e;
            tail = e;
        } else {
            head.previous = e;
        }
        e.next = head;
        head = e;
    }

    //Вставка элемента в конец списка
    public void insertLast(int data) {
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
        return true;
    }

    //Удаление элмента с заданным ключом
    public DLink deleteKey(int key) {
        return null;
    }

    //Вывод с начала списка
    public void displayForward() {
        System.out.println("sout first -> last << Double Linked List: >>");
    }

    //Вывод с конца списка
    public void displayBackward() {
        System.out.println("sout last -> first << Double Linked List: >>");
    }
}
