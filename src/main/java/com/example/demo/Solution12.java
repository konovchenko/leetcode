package com.example.demo;

/**
 * 12. Integer to Roman
 * Seven different symbols represent Roman numerals with the following values:
 * <p>
 * Symbol	Value
 * I	1
 * V	5
 * X	10
 * L	50
 * C	100
 * D	500
 * M	1000
 * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
 * Converting a decimal place value into a Roman numeral has the following rules:
 * <p>
 * If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from
 * the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
 * <p>
 * If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following
 * symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following
 * subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
 * <p>
 * Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10.
 * You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the
 * subtractive form.
 * <p>
 * Given an integer, convert it to a Roman numeral.
 */
public class Solution12 {

    record Pair(String ch, int value) {
    }

    public String intToRoman(int num) {
        var pairs = new Pair[]{
                new Pair("M", 1000),
                new Pair("CM", 900),
                new Pair("D", 500),
                new Pair("CD", 400),
                new Pair("C", 100),
                new Pair("XC", 90),
                new Pair("L", 50),
                new Pair("XL", 40),
                new Pair("X", 10),
                new Pair("IX", 9),
                new Pair("V", 5),
                new Pair("IV", 4),
                new Pair("I", 1)
        };

        var res = new StringBuilder();
        for (int i = 0; i < pairs.length; i++) {
            var pair = pairs[i];
            if (num >= pair.value) {
                res.append(pair.ch);
                num -= pair.value;
                i--;
            }
        }

        return res.toString();
    }
}
