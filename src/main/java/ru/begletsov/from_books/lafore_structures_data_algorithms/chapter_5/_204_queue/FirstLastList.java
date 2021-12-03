package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._204_queue;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public int deleteFirst() {
        int delete = first.iData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return delete;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }
}
