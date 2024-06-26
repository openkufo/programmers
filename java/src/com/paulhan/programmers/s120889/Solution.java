package com.paulhan.programmers.s120889;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[]{3,6,2});
        System.out.println(answer);
    }

    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        for(int i = 0; i < sides.length; i++){
            answer += sides[i];

            if(max < sides[i]){
                max = sides[i];
            }
        }
        answer = (answer - max) > max ? 1 : 2;
        return answer;
    }
}
