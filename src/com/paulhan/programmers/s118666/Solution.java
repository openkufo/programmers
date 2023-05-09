package com.paulhan.programmers.s118666;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        System.out.println("answer : " + answer);
    }

    public String solution(String[] survey, int[] choices) {
        String answer = "";
        final char R = 'R';
        final char T = 'T';
        final char C = 'C';
        final char F = 'F';
        final char J = 'J';
        final char M = 'M';
        final char A = 'A';
        final char N = 'N';
        
        Map<Character, Integer> surveyMap = new HashMap<>();
        surveyMap.put(R,  0);
        surveyMap.put(T,  0);
        surveyMap.put(C,  0);
        surveyMap.put(F,  0);
        surveyMap.put(J,  0);
        surveyMap.put(M,  0);
        surveyMap.put(A,  0);
        surveyMap.put(N,  0);

        for(int i = 0 ; i < choices.length; i++){
            int choice = 0;
            char type = survey[i].charAt(0);
            if(choices[i] <= 3){
                choice = (-choices[i] + 1) % 3 + 3;
            } else if(choices[i] >= 5){
                choice = (choices[i] + 1) % 3 + 1;
                type = survey[i].charAt(1);
            }

            surveyMap.put(type, surveyMap.get(type) + choice);
        }

        StringBuilder sb = new StringBuilder();
        int typeR = surveyMap.get(R);
        int typeT = surveyMap.get(T);
        int typeC = surveyMap.get(C);
        int typeF = surveyMap.get(F);
        int typeJ = surveyMap.get(J);
        int typeM = surveyMap.get(M);
        int typeA = surveyMap.get(A);
        int typeN = surveyMap.get(N);

        if(typeR >= typeT){
            sb.append("R");
        } else {
            sb.append("T");
        }

        if(typeC >= typeF){
            sb.append("C");
        } else {
            sb.append("F");
        }

        if(typeJ >= typeM){
            sb.append("J");
        } else {
            sb.append("M");
        }

        if(typeA >= typeN){
            sb.append("A");
        } else {
            sb.append("N");
        }

        answer = sb.toString();

        return answer;
    }
}
