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
        DLink vtx = new DLink(data);
        vtx.next = head;
        if (isEmpty()) {
            tail = vtx;
        } else {
            head.previous = vtx;
        }
        head = vtx;
    }

    //Вставка элемента в конец списка
    public void insertLast(int data) {
        System.out.println("insertLast -> " + data);
        DLink vtx = new DLink(data);
        vtx.previous = tail;
        if (tail == null) {
            head = vtx;
        } else {
            tail.next = vtx;
        }
        tail = vtx;
    }

    public void printFirstToLast() {
        DLink temp = head;
        while (temp != null) {
            System.out.println("{" + temp.data + "}");
            temp = temp.next;
        }
    }
}
