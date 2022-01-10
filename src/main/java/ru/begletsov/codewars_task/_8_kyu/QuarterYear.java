package ru.begletsov.codewars_task._8_kyu;

/**
 * @task Quarter of the year (8 kyu). Codewars Kata
 * Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
 * For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
 * and month 11 (November), is part of the fourth quarter.
 * @author Sergei Begletsov
 * @since 10.01.2022
 * @version 1
 */

public class QuarterYear {
    public static int quarterOf(int month) {
        int quarter = month / 3;
        return (month % 3) == 0 ? quarter : quarter + 1;
    }
}
