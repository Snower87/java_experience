package ru.begletsov.letscode_task.easy._1672_Richest_Customer_Wealth;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class _1672_Richest_Customer_WealthTest {
    @Test
    public void expectedRslt10() {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int expected = 10;
        int rsl = new _1672_Richest_Customer_Wealth().maximumWealth(accounts);
        assertThat(rsl, is (expected));
    }

    @Test
    public void expectedRslt6() {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int expected = 6;
        int rsl = new _1672_Richest_Customer_Wealth().maximumWealth(accounts);
        assertThat(rsl, is (expected));
    }

    @Test
    public void expectedRslt17() {
        int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
        int expected = 17;
        int rsl = new _1672_Richest_Customer_Wealth().maximumWealth(accounts);
        assertThat(rsl, is (expected));
    }
}