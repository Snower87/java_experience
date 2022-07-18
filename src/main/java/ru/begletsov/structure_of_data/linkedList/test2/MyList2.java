package ru.begletsov.structure_of_data.linkedList.test2;

public class MyList2 {
    private Link2 head;
    private Link2 tail;

    public void addFirst(int data) {
        Link2 el = new Link2(data);
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
        Link2 el = new Link2(data);
        el.data = data;
        if (tail == null) {
            head = el;
            tail = el;
        } else {
            tail.next = el;
            tail = el;
        }
    }

    public void deleteFirst() {
        if (head == null)
            return;
        Link2 el = head.next;
        head = null;
        head = el;
    }

    public void printList() {
        Link2 el = head;
        while (el != null) {
            System.out.println(el.data);
            el = el.next;
        }
        System.out.println();
    }
}
