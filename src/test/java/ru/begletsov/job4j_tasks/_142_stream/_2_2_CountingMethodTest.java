package ru.begletsov.job4j_tasks._142_stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static ru.begletsov.job4j_tasks._142_stream._2_2_CountingMethod.*;

public class _2_2_CountingMethodTest {
    @Test
    public void testByCompany() {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Amazon");
        Company c3 = new Company("Microsoft");
        Worker w1 = new Worker(20, c1);
        Worker w2 = new Worker(25, c2);
        Worker w3 = new Worker(30, c2);
        Worker w4 = new Worker(35, c3);
        Worker w5 = new Worker(40, c3);
        Worker w6 = new Worker(45, c3);

        Map<String, Long> expect = Map.of(
                "Apple", 1L,
                "Amazon", 2L,
                "Microsoft", 3L
        );
        assertEquals(expect, _2_2_CountingMethod.groupAndCount(List.of(w1, w2, w3, w4, w5, w6)));
    }

    @Test
    public void testByAge() {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Amazon");
        Company c3 = new Company("Microsoft");
        Worker w1 = new Worker(20, c1);

        Worker w2 = new Worker(30, c2);
        Worker w3 = new Worker(30, c2);

        Worker w4 = new Worker(35, c3);
        Worker w5 = new Worker(40, c3);
        Worker w6 = new Worker(40, c3);

        Worker w7 = new Worker(18, c1);
        Worker w8 = new Worker(18, c1);
        Worker w9 = new Worker(30, c3);

        Map<Integer, Long> expect = Map.of(
                18, 2L,
                20, 1L,
                30, 3L,
                35, 1L,
                40, 2L
        );
        assertEquals(expect, _2_2_CountingMethod.groupAndCountByAge(List.of(w1, w2, w3, w4, w5, w6, w7, w8, w9)));
    }
}