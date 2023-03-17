package com.paulhan.programmers.s120882;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new int[][] {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1,2}, {0,0}});
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avgScore = new double[score.length];

        for(int i = 0; i < score.length; i++){
            int sum = 0;
            double avg = 0;

            for(int j = 0; j < score[i].length; j++){
                sum += score[i][j];
            }

            avg = (double) sum / 2;
            avgScore[i] = avg;
        }

        for(int i = 0; i < avgScore.length; i++){
            answer[i] = 1;
            for(int j = 0; j < avgScore.length; j++){
                answer[i] += avgScore[i] < avgScore[j] ? 1 : 0;
            }
        }

        return answer;
    }
}

