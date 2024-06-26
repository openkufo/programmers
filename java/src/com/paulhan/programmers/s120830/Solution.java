package com.paulhan.programmers.s120830;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(10, 3);
        System.out.println(answer);
    }
    public int solution(int n, int k) {
        int answer = n * 12_000 + (k * 2_000 - (n/10) * 2_000);
        return answer;
    }
}
