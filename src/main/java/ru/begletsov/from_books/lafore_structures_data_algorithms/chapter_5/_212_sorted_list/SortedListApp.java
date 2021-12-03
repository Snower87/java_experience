package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._212_sorted_list;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList theSortedList = new SortedList();
        theSortedList.insert(20); // Вставка двух элементов
        theSortedList.insert(40);
        theSortedList.displayList(); // Вывод содержимого списка
        theSortedList.insert(10); // Вставка трех элементов
        theSortedList.insert(30);
        theSortedList.insert(50);
        theSortedList.displayList(); // Вывод содержимого списка
        theSortedList.remove(); // Удаление элемента
        theSortedList.displayList(); // Вывод содержимого списка
    }
}
