package ru.begletsov.server_179_task;

import java.util.Scanner;

/**
 * В теории вычислимости важную роль играет функция Аккермана A(m,n), определенная следующим образом:
 *               n+1, m = 0
 * A(m,n) = A(m−1,1), m > 0, n = 0
 *          A(m−1, A(m,n−1)), m > 0, n > 0
 * Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
 * Ввод:
 *   2
 *   2
 * Вывод:
 *   7
 */

public class _3_Function_Akkermans {
    private static int solution(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return solution(m - 1, 1);
        } else {
            return solution(m - 1, solution(m, n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m: ");
        int m = scanner.nextInt();
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        System.out.println("A(" + m +"," + n + ") = " + solution(m, n));
    }
}
