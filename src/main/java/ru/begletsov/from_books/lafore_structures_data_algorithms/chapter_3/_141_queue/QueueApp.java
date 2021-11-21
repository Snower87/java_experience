package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._141_queue;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);

        while (!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.println(n);;
            System.out.println(" ");
        }
        System.out.println("QueueApp end");
    }
}
