package ru.begletsov.from_books.lafore_structures_data_algorithms.chapter_8._355_tree;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();     //создание дерева
        tree.insert(63);
        tree.insert(27);
        tree.insert(80);
        tree.insert(13);
        tree.insert(51);
        tree.insert(70);
        tree.insert(92);
        tree.insert(82);
        tree.insert(26);
        tree.insert(33);
        tree.insert(58);
        tree.insert(57);
        tree.insert(60);

        Node node = tree.find(57);
        if (node != null) {
            System.out.println("Node with key founded!");
        } else {
            System.out.println("Not find!");
        }

        Node min = tree.minimum();
        System.out.println("Min element: " + min.data);

        Node max = tree.maximum();
        System.out.println("Max element: " + max.data);
    }
}
