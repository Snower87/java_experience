package ru.begletsov.job4j_tasks._116_arrays;

/**
 * @Задание 50. Циклический сдвиг вправо массива на N-элементов
 * @Описание Ваша задача выполнить циклический сдвиг вправо с шагом count
 * Например,
 *      {1, 2, 3, 4, 5}, count = 1 => {5, 1, 2, 3, 4}
 *      {1, 2, 3, 4, 5}, count = 2 => {4, 5, 1, 2, 3}
 * @author Sergei Begletsov
 * @since 30.04.2021
 * @version 1
 */

public class RightShift_50 {
    /**
     * Метод делает сдвиг на N-шагов
     * @param nums - входной массив
     * @param count - кол-во шагов
     */
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    /**
     * Метод делает сдвиг с шагом 1
     * @param nums - входной массив
     */
    private static void shift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
