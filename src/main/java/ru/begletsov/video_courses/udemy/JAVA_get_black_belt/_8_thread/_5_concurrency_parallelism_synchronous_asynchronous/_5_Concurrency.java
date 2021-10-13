package ru.begletsov.video_courses.udemy.JAVA_get_black_belt._8_thread._5_concurrency_parallelism_synchronous_asynchronous;

/**
 * = Папка 8. Многопоточность =
 * ---> Урок 5. Понятия concurrency и parallelism. Понятия synchronous и asynchronous
 * @author Sergei Begletsov
 * @version 1
 * @since 12.10.2021
 */

//1. Concurrency - переводится как совпадение или согласованность.
//2. Concurrent - параллельный, совпадающий, согласованный
//3. Примеры: дается такое задание
//   1) петь и кушать <-- Concurrency
//      Сразу петь и кушать вы не можете, нужно прерываться. Вы чуть чуть попели, сделали паузу, скушали кусочек еду, делать то и другое у вас не получится.
//   2) должны готовить и говорить по телефону <-- Concurrency с помощью parallelism
//      Можно делать в одно и тоже мгновение, прерываться не обязательно. Делается несколько заданий сразу.
//4. Concurrency означает выполнение сразу нескольких задач, но не обязательно в одно и тоже время.

//1. Parallelism - выполнение двух и более задач в одно и то же время (параллельно). В компьютерах concurrency может достигаться за счет parallelism.
//2. Синхронное программирования - все задания выполняются ПОСЛЕДОВАТЕЛЬНО друг за другом. Пока вы 1е письмо не напишите, вы не можете приступить ко второму.
//   Main - тоже пример последовательного, синхронного программирования.
//3. Асинхронное программирования - выполняется сразу несколько задач. Каждая след. задача НЕ ЖДЕТ выполнения предыдущей.
//   Дали задание сделать бутерброд и постирать белье. Эти задания м. сделать асинхронно.
//   В асинхронном режиме - когда выполняется одна работа вы можете переключиться на другую работу. На готовку бутерброда к примеру, недожидаясь окончания стирки белья.

public class _5_Concurrency {
    public static void main(String[] args) {

    }
}
