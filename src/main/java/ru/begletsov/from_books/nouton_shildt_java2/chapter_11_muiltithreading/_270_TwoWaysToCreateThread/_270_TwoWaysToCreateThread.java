package ru.begletsov.from_books.nouton_shildt_java2.chapter_11_muiltithreading._270_TwoWaysToCreateThread;

public class _270_TwoWaysToCreateThread {
    public static void main(String[] args) {
        //Вариант 1 - через реализацию интерфейса Runnable
        new ImplRunnable(); //создать новый поток

        //Вариант 2 - через расширение класса Thread
        new ExtThread();

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Таймер главн. потока: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание главного потока");
        }
        System.out.println("Завершение главного потока");
    }
}

class ImplRunnable implements Runnable {
    Thread t;

    public ImplRunnable() {
        //Создать поток
        t = new Thread(this, "Demo Thread");
        System.out.println("Дочерний поток 1: " + t);
        //Запустить поток
        t.start();
    }

    //Точка входа в поток
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Таймер доч. потока 1: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание дочернего потока 1");
        }
        System.out.println("Завершение дочернего потока 1!");
    }
}

class ExtThread extends Thread {

    public ExtThread() {
        super("Thread 2");
        System.out.println("Дочерний поток 2: " + this);
        //Запустить поток
        start();
    }

    //точка входа для второго потока
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Таймер доч. потока 2: " + i);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание доч. потока 2");
        }
        System.out.println("Завершение дочернего потока 2!");
    }
}