package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * 274. H-Index
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their
 * ith paper, return the researcher's h-index.
 * <p>
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that
 * the given researcher has published at least h papers that have each been cited at least h times.
 */
public class Solution274 {
    public int hIndex(int[] citations) {

        citations = IntStream.of(citations).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }

        return hIndex;
    }
}
