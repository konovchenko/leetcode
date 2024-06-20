package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution135Test {

    /**
     * Input: ratings = [1,0,2]
     * Output: 5
     * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
     */
    @Test
    public void test1() {
        int[] nums = new int[]{1, 0, 2};
        int k = new Solution135().candy(nums);
        assertEquals(5, k);
    }

    /**
     * Input: ratings = [1,2,2]
     * Output: 4
     * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
     * The third child gets 1 candy because it satisfies the above two conditions.
     */
    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 2};
        int k = new Solution135().candy(nums);
        assertEquals(4, k);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{1, 3, 2, 2, 1};
        //1, 2, 1, 2, 1
        int k = new Solution135().candy(nums);
        assertEquals(7, k);
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1,2,87,87,87,2,1};
        int k = new Solution135().candy(nums);
        assertEquals(13, k);
    }

    @Test
    public void test5() {
        int[] nums = new int[]{1,6,10,8,7,3,2};
        int k = new Solution135().candy(nums);
        assertEquals(18, k);
    }

}
