package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution122Test {

    /**
     * Input: prices = [7,1,5,3,6,4]
     * Output: 7
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * Total profit is 4 + 3 = 7.
     */
    @Test
    public void test1() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        int output = new Solution122().maxProfit(arr);
        int expected = 7;
        assertEquals(output, expected);
    }

    /**
     * Input: prices = [1,2,3,4,5]
     * Output: 4
     * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
     * Total profit is 4.
     */
    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int output = new Solution122().maxProfit(arr);
        int expected = 4;
        assertEquals(output, expected);
    }

    /**
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum
     * profit of 0.
     */
    @Test
    public void test3() {
        int[] arr = new int[]{7, 6, 4, 3, 1};
        int output = new Solution122().maxProfit(arr);
        int expected = 0;
        assertEquals(output, expected);
    }
}
