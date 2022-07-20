package ru.begletsov.structure_of_data.stack.byArray;

import java.util.Scanner;

public class StartUI {
    StackByArray stackByArray = new StackByArray();

    public void init(Scanner scanner) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Пользователь выбрал: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                stackByArray.printStack();
            } else if (select == 2) {
                System.out.print("Введите добавляемый элемент: ");
                int data = Integer.parseInt(scanner.nextLine());
                stackByArray.push(data);
            } else if (select == 3) {
                int deleteElement = stackByArray.pop();
                System.out.println("Удален элемент с вершины стека: " + deleteElement);
            } else if (select == 4) {
                System.out.println("Элемент с верхушки стека: { " + stackByArray.peek() + " } <- top");
            } else if (select == 5) {
                stackByArray.clear();
            }else if (select == 0) {
                run = false;
            }
            System.out.println();
        }
    }

    private void showMenu() {
        String[] menu = {
                "Вывод всего содержимого стека.    --> print_stack()",
                "Добавление элемента в стек.       --> push()",
                "Извлечение элемента из стека.     --> pop()",
                "Вывод содержимого верхушки стека. --> peek()",
                "Очистка стека.                    --> clear()  "
        };
        System.out.println("Основные команды работы со СТЕКОМ:");
        for (int i = 1; i <= menu.length; i++) {
            System.out.println(i + ". " + menu[i - 1]);
        }
        System.out.println("0. Завершение работы. Выход");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new StartUI().init(scanner);
    }
}
