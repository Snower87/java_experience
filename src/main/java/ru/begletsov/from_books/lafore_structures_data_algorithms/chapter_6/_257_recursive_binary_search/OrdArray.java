package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_6._257_recursive_binary_search;

public class OrdArray {
    private long[] a;
    private int nElements;

    public OrdArray(int max) {
        a = new long[max];
        nElements = 0;
    }

    public int size() {
        return nElements;
    }

    public int find(long searchKey) {
        return recursiveFind(searchKey, 0, nElements - 1);
    }

    private int recursiveFind(long searchKey,
                              int lowerBound,
                              int upperBound) {
        int curIn = (lowerBound + upperBound) / 2;
        if (a[curIn] == searchKey) {
            return curIn;
        } else if (lowerBound > upperBound) {
            return nElements;
        } else {
            if (a[curIn] < searchKey) {
                return recursiveFind(searchKey, curIn + 1, upperBound);
            } else {
                return recursiveFind(searchKey, lowerBound, curIn - 1);
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (a[j] > value) {
                break;
            }
        }
        for (int k = nElements; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        nElements++;
    }

    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
