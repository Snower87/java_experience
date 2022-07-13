package ru.begletsov.structure_of_data.linkedList.test;

public class ConsAppMyList {
    public static void main(String[] args) {
        System.out.println("Example with MyList:");
        MyList myList = new MyList();
        System.out.println("Add first");
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(5);
        myList.printList();
        System.out.println();

        System.out.println("Add last");
        myList.addLast(22);
        myList.addLast(33);
        myList.addLast(55);
        myList.addLast(66);
        myList.printList();
        System.out.println();

        System.out.println("Size collection: " + myList.getSize());
        System.out.println();

        System.out.println("Get by index 1: " + myList.getByIndex(1));
        System.out.println();

        System.out.println("Delete first element: " + myList.getFirst());
        myList.deleteFirst();
        myList.printList();
        System.out.println();

        System.out.println("Delete first element: " + myList.getFirst());
        myList.deleteFirst();
        myList.printList();
        System.out.println();

        System.out.println("Delete last element: " + myList.getLast());
        myList.deleteLast();
        myList.printList();
        System.out.println();

        System.out.println("Delete last element: " + myList.getLast());
        myList.deleteLast();
        myList.printList();
        System.out.println();

        System.out.println("Remove value 5: ");
        myList.removeCurrValue(5);
        myList.printList();
        System.out.println();

        System.out.println("Remove value 22: ");
        myList.removeCurrValue(22);
        myList.printList();
        System.out.println();

        System.out.println("Size collection: " + myList.getSize());
        myList.printList();
        System.out.println();

        System.out.println("Get by index 0: " + myList.getByIndex(0));
        System.out.println();

        System.out.println("Get by index 10: " + myList.getByIndex(10));
        System.out.println();
    }
}
