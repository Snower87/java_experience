package ru.begletsov.thread;

/**
 * Class ThreadExt создание класса через расширение класса Thread
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.09.2020
 * @version 1
 */

public class ThreadExt extends Thread {
    public ThreadExt() {
        //создать новый, второй поток
        super("Demo Thread");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    //точка входа во второй поток
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание дочернего потока.");

        }
        System.out.println("Завершение дочернего потока.");
    }
}
