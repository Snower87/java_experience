package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IndexInArrays_5Test {
    @Test
    public void getFirstElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 1;
        int result = IndexInArrays_5.getFirstElement(in);
        assertThat(result, is(expected));
    }

    @Test
    public void getLastElement() {
        int[] in = {1, 2, 3, 4, 5};
        int expected = 5;
        int result = IndexInArrays_5.getLastElement(in);
        assertThat(result, is(expected));
    }
}