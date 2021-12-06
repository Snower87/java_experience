package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_6._268_merge_sorted_arrays;

public class MergeApp {
    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC, 10);
    }

    public static void merge(int[] arrayA, int sizeA,
                             int[] arrayB, int sizeB,
                             int[] arrayC) {
        int indA = 0, indB = 0, indC = 0;
        while (indA < sizeA && indB < sizeB) {
            if (arrayA[indA] < arrayB[indB]) {
                arrayC[indC++] = arrayA[indA++];
            } else {
                arrayC[indC++] = arrayB[indB++];
            }
        }
        while (indA < sizeA) {
            arrayC[indC++] = arrayA[indA++];
        }
        while (indB < sizeB) {
            arrayC[indC++] = arrayB[indB++];
        }
    }

    public static void display(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
