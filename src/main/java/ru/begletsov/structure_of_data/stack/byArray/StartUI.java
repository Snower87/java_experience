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
                System.out.println(select);
            } else if (select == 2) {
                System.out.println(select);
            } else if (select == 3) {
                System.out.println(select);
            } else if (select == 4) {
                System.out.println(select);
            } else if (select == 0) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Вывод всего содержимого стека.  Метод print_stack()",
                "Добавление элемента в стек.     Метод push()",
                "Извлечение элемента из стека.   Метод int pop()",
                "Вывод содержимого стека.        Метод int peek()"
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
