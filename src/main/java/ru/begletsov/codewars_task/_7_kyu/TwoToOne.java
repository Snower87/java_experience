package ru.begletsov.codewars_task._7_kyu;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @task Two to One (7 kyu). Codewars Kata
 * Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 *
 * Example 1:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 * Example 2:
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 * @author Sergei Begletsov
 * @since 04.08.2021
 * @version 1
 */

public class TwoToOne {
    //version 1
    public static String longest (String s1, String s2) {
        TreeSet<String> treeSet = new TreeSet<>();
        for (Character ch: s1.toCharArray()) {
            treeSet.add(Character.toString(ch));
        }
        for (Character ch: s2.toCharArray()) {
            treeSet.add(Character.toString(ch));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: treeSet) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
    //version 2
    public static String longestVer2 (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }
    //version 3
    public static String longestVer3 (String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }
}
