package ru.begletsov.thread;

/**
 * Class ThreadDemo2 практика работы с многопоточностью
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.09.2020
 * @version 1
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        new ThreadExt();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока.");
        }
        System.out.println("Завершение главного потока.");
    }
}
