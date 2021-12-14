package ru.begletsov.server_179_task;

/**
 * Цифры числа справа налево
 * Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
 * Ввод:
 *   179
 * Вывод:
 *   9 7 1
 */

public class _6_Number_reverse {
    private static String solution(int num) {
        if (num < 10) {
            return Integer.toString(num);
        } else {
            return num % 10 + " " + solution(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 179;
        System.out.println("digits reverse: " + solution(num));
    }
}
