package ru.begletsov.structure_of_data.linkedList.test2;

public class ConsoleAppMyList2 {
    public static void main(String[] args) {
        MyList2 linkedList = new MyList2();
        System.out.println("Односвязанный список: ");
        System.out.println("Вставка элементов в НАЧАЛО списка:");
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.printList();

        System.out.println("Вставка элементов в КОНЕЦ списка:");
        linkedList.addLast(11);
        linkedList.addLast(12);
        linkedList.addLast(13);
        linkedList.printList();

        System.out.println("Удаление ПЕРВЫХ 2-х элементов:");
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.printList();
    }
}
