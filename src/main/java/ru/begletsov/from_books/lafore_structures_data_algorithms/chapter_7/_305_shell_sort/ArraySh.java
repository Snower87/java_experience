package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_7._305_shell_sort;

public class ArraySh {
    private long[] theArray;
    private int nElement;

    public ArraySh(int max) {
        theArray = new long[max];
        nElement = 0;
    }

    public void insert(long value) {
        theArray[nElement] = value;
        nElement++;
    }

    public void display() {
        System.out.print("A = ");
        for (int j = 0; j < nElement; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println();
    }

    public void shellSort() {
        int inner, outer;
        long temp;
        int h = 1;

        while (h <= nElement/3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (outer = h; outer < nElement; outer++) {
                temp = theArray[outer];
                inner = outer;

                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
