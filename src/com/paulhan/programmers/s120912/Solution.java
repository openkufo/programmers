package com.paulhan.programmers.s120912;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[]{7, 77, 17});
        System.out.println(answer);
    }

    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            for(int result = array[i]; result > 0; result/=10){
                answer += result % 10 == 7 ? 1 : 0;
            }
        }
        return answer;
    }
}
