package ru.begletsov.structure_of_data.stack.byArray;

import java.util.Scanner;

public class ConsoleStackByArrayApplication {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу работы со стеком (используя МАССИВЫ)!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        new StartUI().init(scanner);
    }
}