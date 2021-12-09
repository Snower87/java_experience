package ru.begletsov.server_179_task;

import java.util.Scanner;

/**
 * A: От A до B
 * Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
 * в порядке возрастания, если A < B, или в порядке убывания в противном случае.
 * Ввод
 * 5
 * 1
 * Вывод:
 * 5 4 3 2 1
 */

public class _2_From_A_to_B {
    public static void print(int A, int B) {
        if (A == B) {
            return;
        }
        if (A > B) {
            System.out.println(A + " ");
            print(--A, B);
        } else {
            System.out.println(A + " ");
            print(++A, B);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int numA = scanner.nextInt();
        System.out.println("Введите число B: ");
        int numB = scanner.nextInt();
        print(numA, numB);
    }
}
