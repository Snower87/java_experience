package ru.begletsov.structure_of_data.linkedList.suleimanov;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListSuleimanov linkedList = new LinkedListSuleimanov();

        linkedList.addLast("B");
        linkedList.addLast("C");
        linkedList.addLast("D");
        System.out.println("LL: " + linkedList);
        linkedList.addFirst("A");
        System.out.println("LL: " + linkedList);
        System.out.println("Index element with A: " + linkedList.get("A"));
        System.out.println("Index element with Z: " + linkedList.get("Z"));
    }
}
