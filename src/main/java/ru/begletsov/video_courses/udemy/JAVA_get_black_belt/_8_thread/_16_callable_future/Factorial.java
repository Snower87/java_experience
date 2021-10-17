package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._16_callable_future;

import java.util.concurrent.*;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 16. Интерфейсы Callable и Future. Часть 1
 * @author Sergei Begletsov
 * @version 1
 * @since 17.10.2021
 */

//Интерфейсы Callable и Future
//1. Callable представляет собой определенное задание, которое выполняется потоком (так же как и Runnable)
//2. Callable имеет:
//   - return тип, а не void
//   - может выбрасывать Exception
//3. Метод submit() передает наше задание (task) в thread pool, для выполнения одним из потоков и возвращает тип Future,
//   в котором хранится результат задания.

public class Factorial {
    public static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        //1 Вариант - расчета факториала через интерф. Runnable
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        RunnableFactorial runnableFactorial = new RunnableFactorial(6);
//        executorService.execute(runnableFactorial);
//        executorService.shutdown();
//        executorService.awaitTermination(10, TimeUnit.SECONDS);
//        System.out.println(factorialResult);

        //2 Вариант - расчета факториала через интерф. Callable
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFactorial callableFactorial = new CallableFactorial(5);
        Future<Integer> future = executorService.submit(callableFactorial);
        try {
            factorialResult = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}
