package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution169Test {
    @Test
    public void test1() {
        int[] arr = new int[]{3, 2, 3};
        int k = new Solution169().majorityElement(arr);
        assertEquals(3, k);
    }

    @Test
    public void test2() {
        int[] arr = new int[]{2, 2, 1, 1, 1, 2, 2};
        int k = new Solution169().majorityElement(arr);
        assertEquals(2, k);
    }

}
