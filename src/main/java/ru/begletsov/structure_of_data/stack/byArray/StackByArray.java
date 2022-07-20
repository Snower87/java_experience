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
     * Получить максимальный размер стека
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * Получить индкекс вершины стека
     * @return
     */
    public int getTop() {
        return top;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Стек пустой!");
            return;
        }
        for (int i = top; i >= 0 ; i--) {
            String str = "{ " + mass[i] + " }";
            if (i == top) {
                System.out.println(str + " <- top");
            } else {
                System.out.println(str);
            }
        }
    }

    /**
     * Очистка стека
     */
    public void clear() {
        int temp = top + 1;
        System.out.println();
        top = -1;
        for (int i = 0; i < size; i++) {
            mass[i] = 0;
        }
        System.out.println("Стек очищен. Удалено " + temp + " элементов");
    }

    /**
     * Добавление нового элемента в стек
     */
    public void push(int data) {
        if (getTop() < getSize() - 1) {
            mass[++top] = data;
        } else {
            System.out.println("Стек переполнен. Нет пустого места.");
        }
    }

    /**
     * Извлечение элемента из стека с возвратом
     * @return значение элемента на вершине стека
     */
    public int pop() {
        int rsl = -1;
        if (!isEmpty()) {
            rsl = mass[top--];
        } else {
            System.out.println("Стек пуст. Извлечение эл-та невозможно!");
        }
        return rsl;
    }

    /**
     * Возвращает значение элемента с вершины стека, без извлечения
     * @return значение элемента на вершине стека
     */
    public int peek() {
        return mass[top];
    }
}
