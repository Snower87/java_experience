package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._150_priority_queue;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3.PriorityQ;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()) {
            long item = thePQ.remove();
            System.out.println("remove: " + item);
        }
    }
}
