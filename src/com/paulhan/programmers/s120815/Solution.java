package com.paulhan.programmers.s120815;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(6);
        System.out.println(answer);
        
    }
    public int solution(int n) {
        int answer = 6;
        int count = 1;
        while(answer % n != 0){
            answer = 6 * count++;
        }

        answer /= 6;
        return answer;
    }
}
