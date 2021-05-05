package ru.begletsov.codewars_task._6_kyu;

/**
 * @Задание Who likes it? (6 kyu). Codewars Kata
 * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
 * We want to create the text that should be displayed next to such an item.

 * Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who
 * like an item. It must return the display text as shown in the examples:
 *
 * likes {} // must be "no one likes this"
 * likes {"Peter"} // must be "Peter likes this"
 * likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
 * likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
 * likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 * For 4 or more names, the number in and 2 others simply increases.
 * @author Sergei Begletsov
 * @since 05.05.2021
 * @version 1
 */

public class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        String rsl = "";
        switch (names.length) {
            case 0: {
                rsl = "no one likes this";
            } break;
            case 1: {
                rsl = names[0] + " likes this";
            } break;
            case 2: {
                rsl = names[0] + " and " + names[1] + " like this";
            } break;
            case 3: {
                rsl = names[0] + ", " + names[1] + " and " + names[2] + " like this";
            } break;
            default: {
                rsl = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
            } break;
        }

            return rsl;
    }
}
