package ru.begletsov.thread;

/**
 * Class CurrentThreadDemo практика работы с многопоточностью
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.09.2020
 * @version 1
 */

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("Текущий поток: " + thread);

        //изменить имя потока
        thread.setName("MyThread");
        System.out.println("После изменения имени: " + thread);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException iex) {
            System.out.println("Главный поток завершен");
        } finally {
            System.out.println("Завершение работы");
        }
    }
}
