package ru.begletsov.server_179_task;

/**
 * Цифры числа слева направо
 * ано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
 *
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется). Разрешена только рекурсия и целочисленная арифметика.
 * Ввод:
 *   179
 * Вывод:
 *   1 7 9
 */

public class _7_Number_direct_order {
    public static String solution(int num) {
        if (num < 10) {
            return Integer.toString(num);
        } else {
            int degree10 = Integer.toString(num).length();
            if (degree10 > 1) degree10  = (int) Math.pow(10, degree10 - 1);
            return num / degree10 + " " + solution(num % degree10);
        }
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("digits direct order: " + solution(num));
    }
}
