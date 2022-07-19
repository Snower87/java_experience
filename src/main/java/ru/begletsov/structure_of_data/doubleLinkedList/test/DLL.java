package ru.begletsov.structure_of_data.doubleLinkedList.test;

public class DLL {
    private DLink head;
    private DLink tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //Вставка элемента в начало списка
    public void insertFirst(int data) {
        System.out.println("insertFirst -> " + data);
    }

    //Вставка элемента в конец списка
    public void insertLast(int data) {
        System.out.println("insertLast -> " + data);
    }
}
