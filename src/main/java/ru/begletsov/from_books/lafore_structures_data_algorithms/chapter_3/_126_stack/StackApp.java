package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._126_stack;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3.StackX;

public class StackApp {
    public static void main(String[] args) {
        StackX stack = new StackX(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.display();
        stack.peek();

        while (!stack.isEmpty()) {
            long popValue = stack.pop();
            System.out.println("pop value: " + popValue);
        }
    }
}
