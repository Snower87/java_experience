package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_2._67_binary_search_find_method;

import java.util.Arrays;

public class OrderArray {
    private long[] a;       // Ссылка на массив a
    private int nElements; // Количество элементов данных

    //1. Конструктор
    public OrderArray(int max) {
        a = new long[max];
        nElements = 0;
    }

    public int size() {
        return nElements;
    }

    //бинарный поиск
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElements-1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            //1. если текущий элемент = искомому
            if (a[curIn] == searchKey) {
                return curIn;
            //2. Если перешли через верхнюю границу
            } else if (lowerBound > upperBound) {
                return nElements;
            } else {
            //3. Деление диапазона пополам
                if (searchKey > a[curIn]) {
                    lowerBound = curIn + 1;
                } else {
                    lowerBound = curIn - 1;
                }
            }
        }
    }

    // Вставка элемента в массив
    public void insert(long value) {

    }

    public boolean delete(long value) {

    }

    // Вывод содержимого массива
    public void display() {
        Arrays.stream(a).forEach(System.out::println);
    }
}
