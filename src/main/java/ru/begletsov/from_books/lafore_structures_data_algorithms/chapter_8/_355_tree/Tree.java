package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_8._355_tree;

public class Tree {
    private Node root;

    /**
     * Поиск минимального узла
     * @return найденный узел
     */
    public Node minimum() {
        Node current, min;
        current = root;
        min = root;
        while (current != null) {
            min = current;                 // Сохранение узла
            current = current.leftChild;   // Переход к левому потомку
        }
        return min;
    }

    /**
     * Поиск максимального узла
     * @return найденный узел
     */
    public Node maximum() {
        Node current, max;
        current = root;
        max = root;
        while (current != null) {
            max = current;
            current = current.rightChild;
        }
        return max;
    }

    /**
     * Поиск узла с заданным ключом
     * @param key значение ключа
     * @return найденный узел
     */
    public Node find(int key) {
        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                System.out.println(key + " < " + current.data
                        + " -> Going to left child");
                current = current.leftChild;
            } else {
                System.out.println(key + " > " + current.data
                        + " -> Going to right child");
                current = current.rightChild;
            }
            if (current == null)
                return null;
        }
        return current;
    }

    /**
     * Вставка новых данных
     * @param id данные
     */
    public void insert(int id) {
        Node node = new Node();     //создание нового узла
        node.data = id;             //вставка узла
        if (root == null) {         //корневой узел не существует
            root = node;
        } else {                    //корневой узел занят
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.data) { //налево?
                    current = current.leftChild;
                    //если достигнут конец цепочки,
                    //вставить слева
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {                 //или направо?
                    current = current.rightChild;
                    //если достигнут конец цепочки,
                    //вставить справа
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    /**
     * Удаление узла по ключу
     * @param id данные
     */
    public void delete(int id) {
    }

    /**
     * Симметричный обход дерева
     * @param localRoot узел дерева
     */
    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.data);
            inOrder(localRoot.rightChild);
        }
    }
}