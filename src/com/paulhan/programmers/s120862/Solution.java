package com.paulhan.programmers.s120862;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[]{1,2,-3,4,-5});
        System.out.println("answer : " + answer);
    }

    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int negative = numbers[0] * numbers[1];
        int positive = numbers[numbers.length-1] * numbers[numbers.length-2];
        answer = positive >= negative ? positive : negative;
        return answer;
    }
}
