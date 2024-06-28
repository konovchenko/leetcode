package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution14Test {

    /**
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     */
    @Test
    public void test1() {
        var k = new Solution14().longestCommonPrefix(new String[] {"flower","flow","flight"});
        assertEquals("fl", k);
    }

    /**
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    @Test
    public void test2() {
        var k = new Solution14().longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", k);
    }

    @Test
    public void test3() {
        var k = new Solution14().longestCommonPrefix(new String[]{"","b"});
        assertEquals("", k);
    }
}
