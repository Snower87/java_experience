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
        System.out.println("insert last -> " + data  + " to queue");
        theList.insertLast(data);
    }

    // Удаление элемента в начале очереди
    public int remove() {
        int delete = theList.deleteFirst();
        System.out.println("remove first -> " + delete  + " from queue");
        return delete;
    }

    public void displayQueue() {
        System.out.println("<< Queue >>");
        theList.displayList();
    }
}
