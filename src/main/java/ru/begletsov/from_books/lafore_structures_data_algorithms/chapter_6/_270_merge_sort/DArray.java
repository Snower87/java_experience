package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_6._270_merge_sort;

public class DArray {
    private long[] theArray; // Ссылка на массив theArray
    private int nElems; // Количество элементов данных

    public DArray(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems++] = value;
    }

    public void display() {
        System.out.println("Display: ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort() {
        long[] workSpace = new long[nElems];
        recursionMergeSort(workSpace, 0, nElems - 1);
    }

    private void recursionMergeSort(long[] workSpace,
                                    int lowerBound,
                                    int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recursionMergeSort(workSpace, lowerBound, mid);
            recursionMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }

    private void merge(long[] workSpace,
                       int lowPointer,
                       int highPointer,
                       int upperBound) {
        int j = 0;  // Индекс в рабочей области
        int lowerBound = lowPointer;
        int mid = highPointer - 1;
        int n = upperBound-lowerBound+1; // Количество элементов

        while(lowPointer <= mid && highPointer <= upperBound) {
            if( theArray[lowPointer] < theArray[highPointer] ) {
                workSpace[j++] = theArray[lowPointer++];
            }
            else {
                workSpace[j++] = theArray[highPointer++];
            }
        }

        while(lowPointer <= mid) {
            workSpace[j++] = theArray[lowPointer++];
        }
        while(highPointer <= upperBound) {
            workSpace[j++] = theArray[highPointer++];
        }
        for (j = 0; j < n; j++) {
            theArray[lowerBound+j] = workSpace[j];
        }
    }
}
