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
     * Метод возвращает узел со следующим значением после delNode
     * @param delNode
     * @return Узел дерева
     */
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        //переход к правому потомку
        Node current = delNode.rightChild;
        //Пока остаются левые потомки
        while (current != null) {
            successorParent = successor;
            successor = current;
            // Переход к левому потомку
            current = current.leftChild;
        }
        // Если преемник не является правым потомком.
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    /**
     * Удаление узла по ключу
     * @param id данные
     */
    public boolean delete(int id) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        //Поиск узла
        while (current.data != id) {
            parent = current;
            //Двигаемся налево?
            if (id < current.data) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
            //или направо?
                isLeftChild = false;
                current = current.rightChild;
            }
            //Конец цепочки, узел не найден
            if (current == null) {
                return false;
            }
        }
        //Удаляемый узел найден
        //1. Узел не имеет потомков
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }
        //2. Узел имеет 1 потомка:
        //2.а) Если нет правого потомка, узел заменяется левым поддеревом
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        }
        //2.б) Если нет левого потомка, узел заменяется правым поддеревом
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        //3. Узел имеет 2 потомка
        else {
            // Два потомка, узел заменяется преемником
            // Поиск преемника для удаляемого узла (current)
            Node successor = getSuccessor(current);
            // Родитель current связывается с посредником
            if(current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            // Преемник связывается с левым потомком current
            successor.leftChild = current.leftChild;
        } //конец else для двух потомков
        // (преемник не может иметь левого потомка
        return true;
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
