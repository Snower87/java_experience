package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_11._520_hash_chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashChainApp {
    public static void main(String[] args) throws IOException {
        int aKey;
        Link aDataItem;
        int size, n, keyPerCell = 10;

        System.out.println("Введите размер хеш-таблицы:");
        size = 10;
        System.out.println("Введите кол-во итемов в строке");
        n = 10;

        HashTable theHashtable = new HashTable(size);
        for (int i = 0; i < n; i++) {
            aKey = (int) (Math.random() * keyPerCell * size);
            aDataItem = new Link(aKey);
            theHashtable.insert(aDataItem);
        }
        while (true) {
            System.out.println("Enter first letter of:");
            System.out.println("show, insert, delete, or, find");
            char choise = getChar();
            switch (choise) {
                case 's':
                    theHashtable.displayTable();
                    break;
                case 'i':
                    System.out.println("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new Link(aKey);
                    theHashtable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.println("Enter key value to delete: ");
                    aKey = getInt();
                    theHashtable.delete(aKey);
                    break;
                case 'f':
                    System.out.println("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashtable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
