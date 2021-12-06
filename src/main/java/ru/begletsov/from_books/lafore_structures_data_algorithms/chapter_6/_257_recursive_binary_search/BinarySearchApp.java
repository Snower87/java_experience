package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_6._257_recursive_binary_search;

public class BinarySearchApp {
    public static void main(String[] args) {
        int maxSize  = 20;
        OrdArray ordArray = new OrdArray(maxSize);

        ordArray.insert(72);
        ordArray.insert(90);
        ordArray.insert(45);
        ordArray.insert(126);
        ordArray.insert(54);
        ordArray.insert(99);
        ordArray.insert(144);
        ordArray.insert(27);
        ordArray.insert(135);
        ordArray.insert(81);
        ordArray.insert(18);
        ordArray.insert(108);
        ordArray.insert(9);
        ordArray.insert(117);
        ordArray.insert(63);
        ordArray.insert(36);

        ordArray.display();

        int searchKey = 33;
        if (ordArray.find(searchKey) != ordArray.size()) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }
    }
}
