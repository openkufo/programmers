package com.paulhan.programmers.s142086;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution("banana");
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                answer[i] = -1;
                continue;
            }
            
            int index = 0;
            String word = s.substring(0, i);
            String currentChar = s.substring(i, i+1);

            boolean hasChar = word.contains(currentChar);
            index = hasChar ? i - word.lastIndexOf(currentChar) : -1;
            answer[i] = index;
        }
        return answer;
    }

}
