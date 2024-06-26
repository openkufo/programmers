package com.paulhan.programmers.s120906;

public class Solution {
    public static void main(String[] args) {
        new Solution().solution(1234);
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i > 0; i /= 10){
            answer += i % 10;
        }
        return answer;
    }
}
