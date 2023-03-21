package com.paulhan.programmers.s120876;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // int answer = new Solution().solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}});
        int answer = new Solution().solution(new int[][]{{0, 5}, {3, 9}, {1, 10}});
        // int answer = new Solution().solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        System.out.println("answer : " + answer);
    }
    public int solution(int[][] lines) {
        int answer = 0;
        int[] addLine = new int[201];

        int max = 0;
        int min = 200;
        for(int i = 0; i < lines.length; i++){
            int start = lines[i][0];
            int end = lines[i][1];
            for(int j = start; j <= end; j++){
                int index = j + 100;
                addLine[index]++;
                max = max < index ? index : max;
                min = min > index ? index : min;
                
            }
        }
        
        int[] resultArray = new int[max-min+1];
        for(int i = 0; i < resultArray.length; i++){
            resultArray[i] = addLine[min++];
        }

        for(int i = 0; i < resultArray.length-1; i++){
            answer += resultArray[i] >= 2 && resultArray[i+1] >= 2 ? 1 : 0;
        }

        return answer;
    }
}
