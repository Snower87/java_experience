package ru.begletsov.job4j_tasks._112_data_types;

import java.util.Scanner;

/**
 * @Задание 2. Создание short переменной
 * @Описание Программа получает от пользователя число в диапазоне short и выводит его на консоль. Поправьте программу, чтобы она компилировалась.
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class CreateShortType_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}
