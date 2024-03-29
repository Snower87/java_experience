package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._185_linked_list;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class LinkListX {
    private Link first;

    public LinkListX() {
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

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("first --> last");
        Link current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }
}
