package ru.begletsov.codewars_task._8_kyu;

/**
 * @task String repeat (8 kyu). Codewars Kata
 * Write a function called repeatStr which repeats the given string string exactly n times.
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 * @author Sergei Begletsov
 * @since 22.12.2021
 * @version 1
 */

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
