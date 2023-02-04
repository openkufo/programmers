package com.paulhan.programmers.s120907;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        String[] answer = new Solution().solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        System.out.println(Arrays.toString(answer));
    }
    public String[] solution(String[] quizArray) {
        String[] answer = new String[quizArray.length];
        int index = 0;
        for(String quiz : quizArray){
            String[] formula = quiz.split(" ");
            boolean isAnswer;

            int x = Integer.parseInt(formula[0]);
            int y = Integer.parseInt(formula[2]);
            int z = Integer.parseInt(formula[4]);

            if(formula[1].equals("+")){
                isAnswer = x + y == z;
            } else {
                isAnswer = x - y == z;
            }

            answer[index++] = isAnswer ? "O" : "X";
        }

        return answer;
    }
}
