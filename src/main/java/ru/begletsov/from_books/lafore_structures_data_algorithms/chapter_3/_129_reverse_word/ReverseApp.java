package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._129_reverse_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.println("Enter a string:");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed: " + output);
        }
    }
}
