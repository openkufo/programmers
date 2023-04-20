package com.paulhan.programmers.s120860;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[][]{{0, 0}, {-2, 0}, {0, 3}, {-2, 3}});
        System.out.println("answer : " + answer);
    }

    public int solution(int[][] dots) {
        int answer = 0;

        final int X = 0;
        final int Y = 1;

        int[] maxValue = new int[]{-256, -256};
        int[] minValue = new int[]{256, 256};

        for (int i = 0; i < dots.length; i++) {
            if(dots[i][X] > maxValue[X]){
                maxValue[X] = dots[i][X];
            }
            
            if(dots[i][Y] > maxValue[Y]){
                maxValue[Y] = dots[i][Y];
            }
            
            if(dots[i][X] < minValue[X]){
                minValue[X] = dots[i][X];
            }
            
            if(dots[i][Y] < minValue[Y]){
                minValue[Y] = dots[i][Y];
            }
        }
        System.out.println(Arrays.toString(maxValue));
        System.out.println(Arrays.toString(minValue));
        int width = getDistance(maxValue[X], minValue[X]);
        int height = getDistance(maxValue[Y], minValue[Y]);
        answer = Math.abs(width * height);
        
        return answer;
    }

    private int getDistance(int max, int min){
        int distance = 0;
        if(max > 0 && min < 0){
            distance = max - (min + 1) + 1;
        } else {
            distance = Math.abs(max) - Math.abs(min);
        }
        return distance;
    }
}
