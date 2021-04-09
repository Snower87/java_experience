package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 5. Стоит ли играть?
 * @Описание Метод принимает 3 параметра:
 *      1. Вероятность выигрыша;
 *      2. Стоимость выигрыша;
 *      3. Цена игры.
 * Необходимо реализовать метод так, чтобы при условии, что сумма выигрыша (произведение вероятности и стоимости выигрыша) превышает цену игры,
 * метод вернул разницу между этими величинами (т.е. чистую прибыль), или вернул 0 (при условии что чистая прибыль меньше или равна 0).
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class GameChance_5 {
    public static int checkGame(double percent, int prize, int pay) {
        double profitWin = percent * prize;
        if (profitWin - pay > 0) {
            return (int) (profitWin - pay);
        }
            return 0;
    }
}
