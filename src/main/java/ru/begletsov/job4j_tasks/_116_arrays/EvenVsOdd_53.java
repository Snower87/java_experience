package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 53. Четные vs Нечетные - результаты соревнований
 * @Описание Вам даны очки игроков. Игроки разделись таким образом, что под четными индексами находятся очки первой
 * команды, под нечетными второй. Ваша задача определить, кто выиграл. Выигрывает та команда, которая набрала
 * наибольшее число очков. Если выиграла первая команда, то нужно вернуть 1, если вторая, то 2, если ничья то 0.
 * @author Sergei Begletsov
 * @since 30.04.2021
 * @version 1
 */

public class EvenVsOdd_53 {
    /**
     * Метод, показывающий кто победил в соревнованиях
     * @param players - массив очков всех команд
     * @return возвращает результат: 1 - первая команда победила, 2 - вторая, 0 - ничья
     */
    public static int whoWin(int[] players) {
        int rslt = 0;
        int pointsOdd = 0;  //очки первой команды "Нечетной"
        int pointsEven = 0; //очки второй команды "Четной"
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                pointsOdd += players[i];
            } else {
                pointsEven += players[i];
            }
        }
        if (pointsOdd > pointsEven) {
            rslt = 1;
        }
        if (pointsEven > pointsOdd) {
            rslt = 2;
        }
        return rslt;
    }
}
