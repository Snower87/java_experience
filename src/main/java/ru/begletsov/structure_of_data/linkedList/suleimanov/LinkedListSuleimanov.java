package ru.begletsov.structure_of_data.linkedList.suleimanov;

/**
 * @Задание Создание и разбор алгоритма работы односвязанного списка (Евгений Сулейманов)
 * @Описание Структуры данных. Односвязный список
 *           ссылка на видео: https://www.youtube.com/watch?v=BDoiuI5Yl9A
 * @author Sergei Begletsov
 * @since 12.11.2021
 * @version 1
 */

class LinkedListSuleimanov<T> {
    private Node<T> head;

    private static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void addFirst(T t) {
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(T t) {
        if (head == null) {
            head = new Node<>(t);
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(t);
    }

    public int get(T t) {
        if (head == null) {
            return -1;
        }
        if (head.value == t) {
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            ++result;
            if (currentNode.next.value == t) {
                return result;
            }
            currentNode = currentNode.next;
        }

        return -1;
    }

    public void remove(T t) {
        if (head == null) {
            return;
        }
        if (head.value == t) {
            head = head.next;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.value == t) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedListSuleimanov{" +
                "head=" + head +
                '}';
    }
}
