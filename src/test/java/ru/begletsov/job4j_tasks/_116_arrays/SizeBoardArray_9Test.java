package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SizeBoardArray_9Test {
    @Test
    public void getCountRow() {
        int[][] in = {{1}, {2, 3}, {4, 5, 6}};
        int expected = 3;
        int result = SizeBoardArray_9.getCountRow(in);
        assertThat(result, is(expected));
    }

    @Test
    public void getCountCellInRow() {
        int[][] in = {{1}, {2, 3}, {4, 5, 6}};
        int expected = 2;
        int result = SizeBoardArray_9.getCountCellInRow(in, 1);
        assertThat(result, is(expected));
    }
}