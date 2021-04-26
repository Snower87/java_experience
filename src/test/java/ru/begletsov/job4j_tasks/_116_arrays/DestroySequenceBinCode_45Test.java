package ru.begletsov.job4j_tasks._116_arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class DestroySequenceBinCode_45Test {
    @Test
    public void test() {
        assertArrayEquals("0000011111".toCharArray(), DestroySequenceBinCode_45.destroy("1111100000".toCharArray()));
        assertArrayEquals("00000011111".toCharArray(), DestroySequenceBinCode_45.destroy("11111000000".toCharArray()));
        assertArrayEquals("0000001011111".toCharArray(), DestroySequenceBinCode_45.destroy("1111101000000".toCharArray()));
        assertArrayEquals("0000021311111".toCharArray(), DestroySequenceBinCode_45.destroy("1111121300000".toCharArray()));
    }
}