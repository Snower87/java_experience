package ru.begletsov.codewars_task._7_kyu;

/**
 * @task Password maker (7 kyu). Codewars Kata
 * One suggestion to build a satisfactory password is to start with a memorable phrase or sentence and make a password by extracting the first letter of each word.
 * Even better is to replace some of those letters with numbers (e.g., the letter O can be replaced with the number 0):
 * instead of including i or I put the number 1 in the password;
 * instead of including o or O put the number 0 in the password;
 * instead of including s or S put the number 5 in the password.
 * Examples:
 * "Give me liberty or give me death"  --> "Gml0gmd"
 * "Keep Calm and Carry On"            --> "KCaC0"
 * @author Sergei Begletsov
 * @since 14.01.2022
 * @version 1
 */

public class PasswordMaker {
    public static String makePassword(String phrase){
        String[] words = phrase.split(" ");
        if (phrase.equals("")) return "";
        char[] rsl = new char[words.length];
        int index = 0;
        for (String word: words) {
            char ch = word.charAt(0);
            if (ch == 'i' || ch == 'I') ch = '1';
            if (ch == 'o' || ch == 'O') ch = '0';
            if (ch == 's' || ch == 'S') ch = '5';
            rsl[index++] = ch;
        }
        return String.valueOf(rsl);
    }
}
