package ru.begletsov.structure_of_data.linkedList.axis_net;

public class ConsAppList {
    public static void main(String[] args) {
        System.out.println("Example view action with List:");
        List ml = new List();
        ml.addBack(1);
        ml.addBack(12);
        ml.addBack(3);
        ml.addBack(9);
        ml.addBack(0);

        System.out.println("Printing all elements List after add 5 elements:");
        ml.printList();
        System.out.println();

        ml.deleteElement(6);
        ml.deleteElement(5);
        ml.deleteElement(12);
        ml.deleteElement(0);
        ml.deleteElement(4);
        ml.deleteElement(1);

        System.out.println("Printing all elements List after delete some elements:");
        ml.printList();
        System.out.println();
    }
}
