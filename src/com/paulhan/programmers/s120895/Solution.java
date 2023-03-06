package com.paulhan.programmers.s120895;


public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("hello", 1, 2);
        System.out.println(answer);
    }

    public String solution(String my_string, int num1, int num2) {
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);
        char[] charArray = my_string.toCharArray();
        charArray[num1] = num2Char;
        charArray[num2] = num1Char;

        return new String(charArray);
    }
}
