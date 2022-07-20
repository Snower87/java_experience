package ru.begletsov.structure_of_data.stack.byArray;

public class StackByArray {
    private int size = 10;
    private int mass[] = new int[size];
    private int top = -1;

    /**
     * Проверка - стек пустой
     * @return true - да, пустой. false - содержит элементы
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Проверка - стек заполнен
     * @return true - да, заполнен. false - нет, заполнен не до конца
     */
    public boolean isFull() {
        return top == size - 1;
    }

    /**
     * Получить размер стека
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Очистка стека
     */
    public void clear() {
        top = -1;
        for (int i = 0; i < size; i++) {
            mass[i] = 0;
        }
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
