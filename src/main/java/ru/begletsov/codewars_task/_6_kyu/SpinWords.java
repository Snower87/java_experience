package ru.begletsov.codewars_task._6_kyu;

/**
 * @task Stop gninnipS My sdroW! (6 kyu). Codewars Kata
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).
 *
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * Examples:
 *
 * spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
 * spinWords("This is a test") => "This is a test"
 * spinWords("This is another test") => "This is rehtona test"
 * @author Sergei Begletsov
 * @since 10.06.2021
 * @version 1
 */

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String[] rslt = new String[words.length];

        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            rslt[index] = word.length() > 5 ? new StringBuilder(word).reverse().toString() : word;
        }
        return String.join(" ", rslt);
    }
}
