package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeSortedArrays_3Test {
    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = MergeSortedArrays_3.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = MergeSortedArrays_3.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = MergeSortedArrays_3.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = MergeSortedArrays_3.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = MergeSortedArrays_3.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = MergeSortedArrays_3.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}