package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._201_list_stack;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5.Link;

public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }

    public void push(int data) {
        System.out.println("push -> " + data  + " to stack");
        theList.insertFirst(data);
    }

    public int pop() {
        int delete = theList.deleteFirst();
        System.out.println("pop <- " + delete + " from stack");
        return delete;
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void displayStack() {
        System.out.println("<< Stack >>");
        theList.displayList();
    }
}
