package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._132_bracket;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3.StackX;

public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < stackSize; j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = (char) theStack.pop();
                        if ( (ch == '}' && (chx != '{')) ||
                             (ch == ']' && (chx != '[')) ||
                             (ch == ')' && (chx != '(')) ) {
                            System.out.println("Error: " + ch + " at " + j);
                        } else {
                            System.out.println("delimiter " + chx + ch + " is corrected" );
                        }
                    } else {
                        System.out.println("Error: stack is empty!");
                    }
                default:
                    break;
            }
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error end: wrong delimiter");
        }
    }
}
