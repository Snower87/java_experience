package ru.begletsov.job4j_tasks._112_data_types;

import java.util.Scanner;

/**
 * @Задание 1. int число
 * @Описание Ниже приведен код. Программа получает от пользователя число в диапазоне int и выводит его на консоль. Поправьте программу, чтобы она компилировалась.
 * @author Sergei Begletsov
 * @since 07.04.2021
 * @version 1
 */

public class IntType_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(value);
    }
}