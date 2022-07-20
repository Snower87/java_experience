package ru.begletsov.structure_of_data.stack.byArray;

public class StackByArray {
    private int size = 10;
    int mass[] = new int[size];

    /**
     * Проверка - стек пустой
     * @return true - да, пустой. false - содержит элементы
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Проверка - стек заполнен
     * @return true - да, заполнен. false - нет, заполнен не до конца
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Очистка стека
     */
    public void clear() {
    }

    /**
     * Добавление нового элмента в стек
     */
    public void push() {
    }

    /**
     * Извлечение элемента из стека с возвратом
     * @return значение элемента на вершине стека
     */
    public int pop() {
        return 0;
    }

    /**
     * Возвращает значение элемента с вершины стека, без извлечения
     * @return значение элемента на вершине стека
     */
    public int peek() {
        return 0;
    }
}
