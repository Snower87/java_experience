package ru.begletsov.job4j_tasks._115_cycles;

/**
 * @Задание 5. Вывести стоимость конфет за килограмм
 * @Описание Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.
 * @author Sergei Begletsov
 * @since 13.04.2021
 * @version 1
 */

public class SweetPrice_5 {
    public static void out(int price) {
        for (int kg = 1; kg <= 5; kg++) {
            System.out.println(kg * price);
        }
    }
}
