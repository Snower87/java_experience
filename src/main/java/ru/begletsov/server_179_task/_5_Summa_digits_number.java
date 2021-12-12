package ru.begletsov.server_179_task;

/**
 *  Дано натуральное число N. Вычислите сумму его цифр.
 *  При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 *  Ввод	Вывод
 *  179     17
 */

public class _5_Summa_digits_number {
    private static int solution(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + solution(num / 10);
        }
    }

    public static void main(String[] args) {
        int num = 179;
        System.out.println("summa digits: " + solution(num));
    }
}
