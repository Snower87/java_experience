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
        System.out.println();

        System.out.println("Add last");
        myList.addLast(22);
        myList.addLast(33);
        myList.addLast(55);
        myList.addLast(66);
        myList.printList();
    }
}
