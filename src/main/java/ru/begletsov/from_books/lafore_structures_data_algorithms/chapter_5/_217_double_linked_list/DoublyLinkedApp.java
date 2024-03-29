package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._217_double_linked_list;

public class DoublyLinkedApp {
    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22); // Вставка в начале
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertFirst(44);
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertFirst(66);
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertLast(11); // Вставка в конце
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertLast(33);
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertLast(55);
        theList.displayForward(); // Вывод в прямом направлении
        theList.displayBackward(); // Вывод в обратном направлении
        theList.deleteFirst(); // Удаление первого элемента
        theList.deleteLast(); // Удаление последнего элемента
        theList.deleteKey(11); // Удаление элемента с ключом 11
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertAfter(22, 77); // Вставка 77 после 22
        theList.insertAfter(33, 88); // Вставка 88 после 33
        theList.displayForward(); // Вывод в прямом направлении
    }
}
