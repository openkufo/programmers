package com.paulhan.programmers.s120909;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(976);
        System.out.println(answer);
    }
    public int solution(int n) {
        boolean isAnswer = Math.sqrt(n) % 1 == 0.0;
        int answer = isAnswer ? 1 : 2;
        
        return answer;
    }
}
