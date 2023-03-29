package com.paulhan.programmers.s120868;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[]{1, 2});
        System.out.println("answer : " + answer);
    }

    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] > sides[1] ? sides[1] : sides[0];
        
        for(int i = max; i > max-min; i--){
            if(min + i > max){
                answer++;
            }
        }
        
        answer += max + min - (max + 1);
        return answer;
    }
}
