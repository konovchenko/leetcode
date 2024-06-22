package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution13Test {

    /**
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     */
    @Test
    public void test1() {
        int k = new Solution13().romanToInt("III");
        assertEquals(3, k);
    }

    /**
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     */
    @Test
    public void test2() {
        int k = new Solution13().romanToInt("LVIII");
        assertEquals(58, k);
    }

    /**
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    @Test
    public void test3() {
        int k = new Solution13().romanToInt("MCMXCIV");
        assertEquals(1994, k);
    }

    @Test
    public void test4() {
        assertEquals(27, new Solution13().romanToInt("XXVII"));
    }

    @Test
    public void test5() {
        assertEquals(4, new Solution13().romanToInt("IV"));
    }

}
