package ru.begletsov.structure_of_data.doubleLinkedList.test;

public class DLLApplication {
    public static void main(String[] args) {
        DLL doubleLinkedList = new DLL();
        System.out.println("Пример работы с двусвязанным списком: ");
        int data = 50;
        System.out.println("Вставка элемента " + data + " в начало списка");
        doubleLinkedList.insertFirst(data);
        data = 40;
        System.out.println("Вставка элемента " + data + " в начало списка");
        doubleLinkedList.insertFirst(data);
        data = 30;
        System.out.println("Вставка элемента " + data + " в начало списка");
        doubleLinkedList.insertFirst(data);

        System.out.println();
        System.out.println("Содержимое всего списка:");
        doubleLinkedList.printFirstToLast();

        data = 10;
        System.out.println("Вставка элемента " + data + " в конец списка");
        doubleLinkedList.insertLast(data);
        data = 11;
        System.out.println("Вставка элемента " + data + " в конец списка");
        doubleLinkedList.insertLast(data);
        data = 12;
        System.out.println("Вставка элемента " + data + " в конец списка");
        doubleLinkedList.insertLast(data);

        System.out.println();
        System.out.println("Содержимое всего списка:");
        doubleLinkedList.printFirstToLast();

        System.out.println("Удаление ПЕРВОГО элемента: " + doubleLinkedList.deleteFirst().data);
        System.out.println("Удаление ПЕРВОГО элемента: " + doubleLinkedList.deleteFirst().data);
        System.out.println();
        System.out.println("Содержимое всего списка:");
        doubleLinkedList.printFirstToLast();

        System.out.println("Удаление ПОСЛЕДНЕГО элемента: " + doubleLinkedList.deleteLast().data);
        System.out.println("Удаление ПОСЛЕДНЕГО элемента: " + doubleLinkedList.deleteLast().data);
        System.out.println();
        System.out.println("Содержимое всего списка:");
        doubleLinkedList.printFirstToLast();
    }
}
