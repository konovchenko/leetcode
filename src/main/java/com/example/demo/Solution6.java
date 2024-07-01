package com.example.demo;

/**
 * 6. Zigzag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        /*
        Input: s = "PAYPALISHIRING", numRows = 4
        Output: "PINALSIGYAHRPI"
        Explanation:
        P     I    N
        A   L S  I G
        Y A   H R
        P     I


        ABCDE, numRows = 3
        A E
        BD
        C


        ABCDEFGHI, numRows = 4
        A  G
        B F
        CE
        D

        ABCDEFGHI, numRows = 5
        A   I
        B  H
        C G
        DF
        E

        next i value: 1, 4, 6, 8
        numRows     : 2, 3, 4, 5

        */
        if (numRows == 1) return s;

        var res = new StringBuilder();

        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i <= s.length() * 2; i = i + 2 * numRows - 2) {
                if (j > 0 && j < numRows - 1 && i > 0 && i - j < s.length()) {
                    res.append(s.charAt(i - j));
                }
                if (i + j < s.length()) {
                    res.append(s.charAt(i + j));
                }
            }
        }

        return res.toString();
    }
}
