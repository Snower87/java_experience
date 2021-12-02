package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._204_queue;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    // Вставка элемента в конец очереди
    public void insert(int data) {
        theList.insertLast(data);
    }

    // Удаление элемента в начале очереди
    public int remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {

    }
}
