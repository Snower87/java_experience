package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //вставка элемента в конец очереди
    public void insert(long j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return  temp;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }
}
