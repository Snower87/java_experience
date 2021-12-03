package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._212_sorted_list;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    //Вставка в порядке сортировки
    public void insert(int key) {
        System.out.println("insert -> " + key  + " to sorted list");
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.iData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    //Удаление первого элемента
    public Link remove() {
        Link temp = first;
        System.out.println("remove first -> " + temp.iData  + " from sorted list");
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("<< Sorted List >> (first --> last)");
        Link current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }
}
