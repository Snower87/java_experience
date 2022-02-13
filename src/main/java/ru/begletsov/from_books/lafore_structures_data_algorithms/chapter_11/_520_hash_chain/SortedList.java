package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_11._520_hash_chain;

public class SortedList {
    private Link first;

    public SortedList() {
        first = null;
    }

    //вставка в порядке сортировки
    public void insert(Link theLink) {
        int key  = theLink.getKey();
        Link previous = null;
        Link current = first;
        //до конца списка
        while (current != null && key > current.getKey()) { //или пока current <= key
            previous = current;
            current = current.next;     //переход к след. элементу
        }
        if (previous == null) {
            first = theLink;
        } else {
            previous.next = theLink;
        }
        theLink.next  = current;
    }

    //удаление элемента
    public void delete(int key) {
        Link previous = null;
        Link current = first;

        while (current != null && key != current.getKey()) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = first.next; //если первый элемент - изменить first
        } else {
            previous.next = current.next; //удалить текущий элемент
        }
    }

    //поиск элемента по ключу
    public Link find(int key) {
        Link current = first;

        while (current != null && key >= current.getKey()) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayList() {
        System.out.print("Link (first --> last)");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
