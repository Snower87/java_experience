package ru.begletsov.server_179_task;

import java.util.Scanner;

/**
 * A: От 1 до n
 * Дано натуральное число n. Выведите все числа от 1 до n.
 * Ввод:
 * 5
 * Вывод:
 * 1 2 3 4 5
 */

public class _1_From_1_to_n {
    public static void print(int a) {
        if (a < 1) {
            return;
        }
        System.out.println(a + " ");
        print(a - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число n: ");
        int num = scanner.nextInt();
        print(num);
    }
}