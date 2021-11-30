package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._192_linked_list2;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class LinkListX2 {
    private Link first;

    public LinkListX2() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id) {
        Link newLink = new Link(id);
        newLink.next = first;
        first = newLink;
    }

    // Поиск элемента с заданным ключом
    public Link find(int key) {
        Link founded = first;
        while (founded != null) {
            if (founded.iData == key) {
                break;
            }
            founded = founded.next;
        }
        return founded;
    }

    // Удаление элемента с заданным ключом
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    // Вывод содержимого списка
    public void displayList() {
        System.out.println("first --> last");
        Link current = first;
        while (current != null) {
            current.displayLinkX();
            current = current.next;
        }
    }
}
