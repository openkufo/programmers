package com.paulhan.programmers.s120817;

public class Solution {
    public static void main(String[] args) {
        new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public double solution(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }

        answer = (double) sum / numbers.length;
        return answer;
    }
}
