package com.paulhan.programmers.s120899;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] answer = new Solution().solution(new int[]{9,10,11,8});
        System.out.println(Arrays.toString(answer));
    }
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i = 0; i < array.length; i++){
            if(answer[0] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
