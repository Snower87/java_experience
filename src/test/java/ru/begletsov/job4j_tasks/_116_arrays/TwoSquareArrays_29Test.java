package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoSquareArrays_29Test {
    @Test
    public void collectArray() {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        int[] expected = {2, 10, 92, 82, 32, 40, 8, 27, 35};
        int[] rsl = TwoSquareArrays_29.collectArray(left, right);
        assertThat(rsl, is(expected));
    }
}