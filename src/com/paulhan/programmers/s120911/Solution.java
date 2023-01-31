package com.paulhan.programmers.s120911;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String test = new Solution().solution("Bcad");
        System.out.println(test);
    }

    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] my_char = my_string.toCharArray();
        Arrays.sort(my_char);
        my_string = String.valueOf(my_char);
        return my_string;
    }
}
