package com.example.demo;

import java.util.Arrays;

/**
 * 135. Candy
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * <p>
 * You are giving candies to these children subjected to the following requirements:
 * <p>
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 */
public class Solution135 {
    public int candy(int[] ratings) {
        //1, 2, 87, 87, 87, 2, 1
        //1, 2,  3,  1,  3, 2, 1
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);

        boolean change = true;
        while(change) {
            change = false;
            for (int i = 1; i < ratings.length; i++) {
                if (ratings[i - 1] > ratings[i] && candy[i - 1] <= candy[i]) {
                    candy[i - 1] = candy[i] + 1;
                    change = true;
                } else if (ratings[i - 1] < ratings[i] && candy[i - 1] >= candy[i]) {
                    candy[i] = candy[i - 1] + 1;
                    change = true;
                }
            }
        }

        return Arrays.stream(candy)
                .sum();
    }
}
