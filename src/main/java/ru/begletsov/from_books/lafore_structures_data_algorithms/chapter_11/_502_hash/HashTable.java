package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_11._502_hash;

public class HashTable {
    private DataItem[] hashArray;   // Массив ячеек хеш-таблицы
    private int arraySize;
    DataItem nonItem = new DataItem(-1); // Ключ удаленного элемента -1

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.println(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }

    //Хеш-функция
    public int hashFunc(int key) {
        return key % arraySize;
    }

    // Вставка элемента данных
    // (Метод предполагает, что таблица не заполнена)
    public void insert(DataItem item) {
        int key = item.getKey(); // Получение ключа
        int hashVal = hashFunc(key); // Хеширование ключа
        // Пока не будет найдена
        // пустая ячейка или -1
        while (hashArray[hashVal] != null &&
               hashArray[hashVal].getKey() != -1)
        {
            ++hashVal; // Переход к следующей ячейке
            hashVal %= arraySize; // При достижении конца таблицы
        } // происходит возврат к началу
        hashArray[hashVal] = item; // Вставка элемента
    }

    // Удаление элемента данных
    public DataItem delete(int key)
    {
        int hashVal = hashFunc(key);        // Хеширование ключа
        while(hashArray[hashVal] != null) // Пока не будет найдена пустая ячейка
        {
            // Ключ найден?
            if(hashArray[hashVal].getKey() == key)
            {
                DataItem temp = hashArray[hashVal];     // Временное сохранение
                hashArray[hashVal] = nonItem;           // Удаление элемента
                return temp;                            // Метод возвращает элемент
            }
            ++hashVal;                  // Переход к следующей ячейке
            hashVal %= arraySize;       // При достижении конца таблицы
        }
        return null; // Элемент не найден
    }

    // Поиск элемента с заданным ключом
    // (Метод предполагает, что таблица не заполнена)
    public DataItem find(int key)
    {
        int hashVal = hashFunc(key);        // Хеширование ключа
        while(hashArray[hashVal] != null)   // Пока не будет найдена пустая ячейка
        {
            // Ключ найден?
            if(hashArray[hashVal].getKey() == key)
                return hashArray[hashVal];      // Да, вернуть элемент
            ++hashVal;                          // Переход к следующей ячейке
            hashVal %= arraySize;       // При достижении конца таблицы
        }
        return null; // Элемент не найден
    }
}
