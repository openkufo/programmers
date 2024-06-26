package com.paulhan.programmers.s120910;

public class Solution {
    
    public static void main(String[] args) {
        int answer = new Solution().solution(7, 15);
        System.out.println("7번 째 줄 : " + answer);
    }

    public int solution(int n, int t) {
        int answer = (int) Math.pow(2, t) * n;
        return answer;
    }
}
