package ru.begletsov.exception;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * Класс CatchScannerException с обработчиком исключения по результатам анализа введеного пользователем числа
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 12.08.2020
 * @version 1
 */

public class CatchScannerException {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int numbIn = in.nextInt();
            if (numbIn <= 30) {
                throw new Exception("Введите число больше 30!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа завершена");
    }
}
