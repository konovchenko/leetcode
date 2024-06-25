package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution12Test {

    /**
     * Input: num = 3749
     * <p>
     * Output: "MMMDCCXLIX"
     * <p>
     * Explanation:
     * <p>
     * 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
     * 700 = DCC as 500 (D) + 100 (C) + 100 (C)
     * 40 = XL as 10 (X) less of 50 (L)
     * 9 = IX as 1 (I) less of 10 (X)
     * Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
     */
    @Test
    public void test1() {
        var k = new Solution12().intToRoman(3749);
        assertEquals("MMMDCCXLIX", k);
    }

    /**
     * Input: num = 58
     * <p>
     * Output: "LVIII"
     * <p>
     * Explanation:
     * <p>
     * 50 = L
     * 8 = VIII
     */
    @Test
    public void test2() {
        var k = new Solution12().intToRoman(58);
        assertEquals("LVIII", k);
    }

    /**
     * Input: num = 1994
     * <p>
     * Output: "MCMXCIV"
     * <p>
     * Explanation:
     * <p>
     * 1000 = M
     * 900 = CM
     * 90 = XC
     * 4 = IV
     */
    @Test
    public void test3() {
        var k = new Solution12().intToRoman(1994);
        assertEquals("MCMXCIV", k);
    }

    @Test
    public void test4() {
        var k = new Solution12().intToRoman(3);
        assertEquals("III", k);
    }

    @Test
    public void test5() {
        var k = new Solution12().intToRoman(4);
        assertEquals("IV", k);
    }

    @Test
    public void test6() {
        var k = new Solution12().intToRoman(9);
        assertEquals("IX", k);
    }

    @Test
    public void test7() {
        var k = new Solution12().intToRoman(12);
        assertEquals("XII", k);
    }
}
