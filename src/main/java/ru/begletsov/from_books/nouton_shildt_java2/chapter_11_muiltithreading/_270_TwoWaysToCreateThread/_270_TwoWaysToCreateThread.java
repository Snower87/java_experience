package ru.begletsov.from_books.nouton_shildt_java2.chapter_11_muiltithreading._270_TwoWaysToCreateThread;

public class _270_TwoWaysToCreateThread {
    public static void main(String[] args) {
        //Вариант 1 - через реализацию интерфейса Runnable
        new ImplRunnable(); //создать новый поток

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

class ImplRunnable implements Runnable{
    Thread t;

    public ImplRunnable() {
        //Создать поток
        t = new Thread(this, "Demo Thread");
        System.out.println("Дочерний поток: " + t);
        //Запустить поток
        t.start();
    }

    //Точка входа в поток
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Таймер доч. потока: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание дочернего потока");
        }
        System.out.println("Завершение дочернего потока");
    }
}