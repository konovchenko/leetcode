package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution380Test {

    /**
     * Input
     * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
     * [[], [1], [2], [2], [], [1], [2], []]
     * Output
     * [null, true, false, true, 2, true, false, 2]
     * <p>
     * Explanation
     * RandomizedSet randomizedSet = new RandomizedSet();
     * randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
     * randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
     * randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
     * randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
     * randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
     * randomizedSet.insert(2); // 2 was already in the set, so return false.
     * randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
     */
    @Test
    public void test1() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(1)); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertFalse(randomizedSet.remove(2)); // Returns false as 2 does not exist in the set.
        assertTrue(randomizedSet.insert(2)); // Inserts 2 to the set, returns true. Set now contains [1,2].
        int r = randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
        assertTrue((r == 1) || r == 2);
        assertTrue(randomizedSet.remove(1)); // Removes 1 from the set, returns true. Set now contains [2].
        assertFalse(randomizedSet.insert(2)); // 2 was already in the set, so return false.
        assertEquals(2, randomizedSet.getRandom()); // Since 2 is the only number in the set, getRandom() will always return 2.


        int[] nums = new int[]{3, 0, 6, 1, 5};
        int k = new Solution274().hIndex(nums);
        assertEquals(3, k);
    }


}
