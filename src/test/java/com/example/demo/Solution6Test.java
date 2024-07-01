package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution6Test {

    /**
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     */
    @Test
    public void test1() {
        var k = new Solution6().convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", k);
    }


    /**
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "PINALSIGYAHRPI"
     * Explanation:
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */
    @Test
    public void test2() {
        var k = new Solution6().convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", k);
    }

    /**
     * Input: s = "A", numRows = 1
     * Output: "A"
     */
    @Test
    public void test3() {
        var k = new Solution6().convert("A", 1);
        assertEquals("A", k);
    }

    @Test
    public void test4() {
        var k = new Solution6().convert("ABC", 2);
        assertEquals("ACB", k);
    }

    @Test
    public void test5() {
        var k = new Solution6().convert("ABCD", 3);
        assertEquals("ABDC", k);
    }

    @Test
    public void test6() {
        var k = new Solution6().convert("ABCDE", 4);
        assertEquals("ABCED", k);
    }
}
