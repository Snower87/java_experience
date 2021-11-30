package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_5._197_two_sided_linked_list;

public class FirstLastApp {
    public static void main(String[] args) {
        FirstLastList theList = new FirstLastList();
        theList.insertFirst(22); // Вставка в начало списка
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11); // Вставка в конец списка
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayList(); // Вывод содержимого списка
        theList.deleteFirst(); // Удаление первых двух элементов
        theList.deleteFirst();
        theList.displayList(); // Повторный вывод
    }
}
