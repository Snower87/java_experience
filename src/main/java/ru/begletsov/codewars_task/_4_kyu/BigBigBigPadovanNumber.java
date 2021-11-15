package ru.begletsov.codewars_task._4_kyu;

import java.math.BigInteger;

/**
 * @task Big Big Big Padovan Number? (4 kyu). Codewars Kata
 * Description:
 * The Padovan sequence is the sequence of integers P(n) defined by the initial values
 * P(0)=P(1)=P(2)=1
 * and the recurrence relation
 * P(n)=P(n-2)+P(n-3)
 * The first few values of P(n) are
 * 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, ...
 * Task
 * The task is to write a method that returns i-th Padovan number for i around 1,000,000
 * Examples
 * Padovan.Get(0) == 1
 * Padovan.Get(1) == 1
 * Padovan.Get(2) == 1
 * Padovan.Get(n) == Padovan.Get(n-2) + Padovan.Get(n-3)
 * Hint: use matrices
 * @author Sergei Begletsov
 * @since 15.11.2021
 * @version 1
 */

public class BigBigBigPadovanNumber {
    public static BigInteger Get (long power)
    {
        //       -3 -2 -1 |
        // 0, 1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18   19   20
        // 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, ...
        BigInteger rsl = BigInteger.ONE;
        if (power < 3) {
            return rsl;
        }
        BigInteger matrix[] = new BigInteger[(int) power];
        matrix[0] = BigInteger.ONE;
        matrix[1] = BigInteger.ONE;
        matrix[2] = BigInteger.ONE;
        for (int i = 3; i < (int) power; i++) {
            matrix[i] = matrix[i- 2].add(matrix[i - 3]);
            if (i - 4 >= 0) {
                matrix[i - 4] = null;
            }
        }
        rsl = matrix[(int) power - 2].add(matrix[(int) power - 3]);
        return rsl;
    }
}
