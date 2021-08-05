package ru.begletsov.codewars_task._8_kyu;

/**
 * @task Fake Binary (8 kyu). Codewars Kata
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 * @author Sergei Begletsov
 * @since 05.08.2021
 * @version 1
 */

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char[] chars = numberString.toCharArray();
        for (int ind = 0; ind < chars.length; ind++) {
            chars[ind] =  chars[ind] >= '5' ? '1' : '0';
        }
        return String.valueOf(chars);
    }
}
