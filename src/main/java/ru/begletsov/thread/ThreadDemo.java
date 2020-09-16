package ru.begletsov.thread;

/**
 * Class ThreadDemo практика работы с многопоточностью
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.09.2020
 * @version 1
 */

public class ThreadDemo {
    public static void main(String[] args) {
        new ThreadImp();

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
