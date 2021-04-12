package ru.begletsov.job4j_tasks._114_branch_operators;

/**
 * @Задание 10. Еженедельная зарплата
 * @Описание Метод принимает массив целочисленных значений, при этом каждый элемент массива означает количество часов,
 * которые работник отработал в каждый день недели. Работник может работать и в выходные.
 * При этом оплачивается труд следующим образом:
 * 1. В течение первых 8 часов каждый рабочий день за каждый час зарплата составляет 10 долларов.
 * 2. За каждый отработанный час сверх нормы (8 часов) работник зарабатывает 15 долларов.
 * 3. В выходные дни работодатель платит в два раза больше, как за каждый час по норме(первые 8 часов), так и сверхурочные.
 * Необходимо реализовать метод, который посчитает общую сумму заработка за отработанную неделю.
 * @author Sergei Begletsov
 * @since 09.04.2021
 * @version 1
 */

public class WeeklySalary_10 {
    public static int calculate(int[] hours) {
        int calcHoursCost = 0;
        int costOneHourWork = 10; //10$ for 1 hour
        for (int ind = 0; ind < hours.length; ind++) {
            int n_day = ind + 1;
            if (n_day <= 5 ) {
                calcHoursCost += hours[ind] * costOneHourWork;
                if (hours[ind] > 8) {
                    calcHoursCost += (hours[ind] - 8) * costOneHourWork/2;
                }
            } else {
                calcHoursCost += hours[ind] * costOneHourWork*2;
                if (hours[ind] > 8) {
                    calcHoursCost += (hours[ind] - 8) * costOneHourWork;
                }
            }
        }
        return calcHoursCost;
    }
}
