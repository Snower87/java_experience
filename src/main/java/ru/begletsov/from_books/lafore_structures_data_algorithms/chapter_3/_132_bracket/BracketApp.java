package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_3._132_bracket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketApp {
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            System.out.println("Enter string with delimiter");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }
}
