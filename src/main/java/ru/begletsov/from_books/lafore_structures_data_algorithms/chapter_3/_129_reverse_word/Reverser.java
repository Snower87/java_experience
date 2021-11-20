package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._129_reverse_word;

import ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3.StackX;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    }

    public String doRev() {
        int stackSize = input.length();
        StackX theStack = new StackX(input.length());
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = (char) theStack.pop();
            output += ch;
        }
        return output;
    }
}
