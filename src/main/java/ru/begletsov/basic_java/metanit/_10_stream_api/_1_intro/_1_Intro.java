package ru.begletsov.basic_java.metanit._10_stream_api._1_intro;

import java.util.Arrays;

public class _1_Intro {
    public static void main(String[] args) {
        //Пример 1. Код ДО использования Stream API
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count1 = 0;
        for (int i: numbers) {
            if (i > 0) count1++;
        }
        System.out.println("count1: " + count1);

        //Пример 2. Код ПОСЛЕ использования Stream API
        long count2 = Arrays.stream(numbers)
                .filter(num -> num > 0)
                .count();
        System.out.println("count2: " + count2);
    }
}
