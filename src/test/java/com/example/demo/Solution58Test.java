package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution58Test {

    /**
     * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     */
    @Test
    public void test1() {
        var k = new Solution58().lengthOfLastWord("Hello World");
        assertEquals(5, k);
    }

    /**
     * Input: s = "   fly me   to   the moon  "
     * Output: 4
     * Explanation: The last word is "moon" with length 4.
     */
    @Test
    public void test2() {
        var k = new Solution58().lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, k);
    }

    /**
     * Input: s = "luffy is still joyboy"
     * Output: 6
     * Explanation: The last word is "joyboy" with length 6.
     */
    @Test
    public void test3() {
        var k = new Solution58().lengthOfLastWord(" luffy is still joyboy");
        assertEquals(6, k);
    }}
