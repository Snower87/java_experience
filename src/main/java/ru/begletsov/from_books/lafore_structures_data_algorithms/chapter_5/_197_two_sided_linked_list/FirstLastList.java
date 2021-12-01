package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._197_two_sided_linked_list;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        }
        last.next = newLink;
        last = newLink;
    }

    public int deleteFirst() {
        Link delete = first;
        if (delete != null) {
            System.out.print("Delete: ");
            delete.displayLinkX();
            first = delete.next;
        }
        return delete.iData;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }
}
