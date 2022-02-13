package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_11._520_hash_chain;

public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for (int j = 0; j < arraySize; j++) {
            hashArray[j] = new SortedList();
        }
    }

    //вывод содержимого списка
    public void displayTable() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + ". "); //вывод ячейки
            hashArray[i].displayList();
        }
    }

    //хеш-функция
    public int hashFunc(int key) {
        return key % arraySize;
    }

    //вставка элемента
    public void insert(Link theLink) {
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    //удаление элемента по ключу
    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    //поиск элемента по ключу
    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
}
