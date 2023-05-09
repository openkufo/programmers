package com.paulhan.programmers.s160586;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // String[] keymap = new String[]{"ABACD", "BCEFD"};
        // String[] targets = new String[]{"ABCD", "AABB"};
        String[] keymap = new String[]{"BC"};
        String[] targets = new String[]{"AC", "BC"};
        int[] answer = new Solution().solution(keymap, targets);
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int answerIndex = 0;

        for(String target : targets){
            for(char targetChar : target.toCharArray()){
                int min = 101;
                for(String key : keymap){
                    int index = key.indexOf(Character.toString(targetChar)) + 1;

                    if(index == 0){
                        continue;
                    }

                    if(min > index){
                        min = index;
                    }
                }

                if(min != 101){
                    answer[answerIndex] += min;
                } else {
                    answer[answerIndex] = -1;
                    break;
                }
            }
            answerIndex++;
        }

        return answer;
    }
}
