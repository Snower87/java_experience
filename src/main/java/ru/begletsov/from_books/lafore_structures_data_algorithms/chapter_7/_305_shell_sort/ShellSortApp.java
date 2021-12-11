package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_7._305_shell_sort;

public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        ArraySh arr = new ArraySh(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (int)(Math.random() * 99);
            arr.insert(n);
        }
        arr.display();
        arr.shellSort();
        arr.display();
    }
}
