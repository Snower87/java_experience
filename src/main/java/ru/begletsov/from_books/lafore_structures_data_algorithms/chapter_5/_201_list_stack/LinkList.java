package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._201_list_stack;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public int deleteFirst() {
        Link delete = first;
        first = first.next;
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
