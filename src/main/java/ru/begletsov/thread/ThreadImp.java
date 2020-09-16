package ru.begletsov.thread;

/**
 * Class ThreadImp создание класса через реализацию интерфейса Runnable
 * 1) создание класса
 * @author Sergei Begletsov
 * @since 16.09.2020
 * @version 1
 */

//создание второго потока
public class ThreadImp implements Runnable {
    Thread t;

    public ThreadImp() {
        //создать новый, второй поток
        t = new Thread(this,"Demo thread");
        System.out.println("Дочерний поток: " + t);
        t.start();
    }

    //точка входа во второй поток
    @Override
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
