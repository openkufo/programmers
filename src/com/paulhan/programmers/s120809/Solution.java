package com.paulhan.programmers.s120809;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new int[]{1, 2, 100, -99, 1, 2, 3});
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}
