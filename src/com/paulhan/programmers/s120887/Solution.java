package com.paulhan.programmers.s120887;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(1, 13, 1);
        System.out.println(answer);
    }
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int number = i; number <= j; number++){
            for(int remainder = number; remainder > 0; remainder /= 10){
                answer += remainder%10 == k ? 1 : 0;
            }
        }
        return answer;
    }
}
