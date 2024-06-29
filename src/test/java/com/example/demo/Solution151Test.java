package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution151Test {

    /**
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     */
    @Test
    public void test1() {
        var k = new Solution151().reverseWords("the sky is blue");
        assertEquals("blue is sky the", k);
    }

    /**
     * Input: s = "  hello world  "
     * Output: "world hello"
     * Explanation: Your reversed string should not contain leading or trailing spaces.
     */
    @Test
    public void test2() {
        var k = new Solution151().reverseWords("  hello world  ");
        assertEquals("world hello", k);
    }

    /**
     * Input: s = "a good   example"
     * Output: "example good a"
     * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
     */
    @Test
    public void test3() {
        var k = new Solution151().reverseWords("a good   example");
        assertEquals("example good a", k);
    }
}
