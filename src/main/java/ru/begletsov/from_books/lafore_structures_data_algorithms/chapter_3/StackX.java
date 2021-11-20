package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3;

import java.util.Arrays;

public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int size) {
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long num) {
        stackArray[++top] = num;
    }

    public long pop() {
        return stackArray[top--];
    }

    public void peek() {
        System.out.println("peek = " + stackArray[top]);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        System.out.println("Display array:");
        Arrays.stream(stackArray).limit(top + 1).forEach(System.out::println);
    }
}
