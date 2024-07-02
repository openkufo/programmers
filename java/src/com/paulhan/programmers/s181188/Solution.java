package com.paulhan.programmers.s181188;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[][] {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}});
        solution.solution(new int[][] {{0, 4}, {1, 2}, {1, 3}, {3, 4}});
        solution.solution(new int[][] {{0, 4}, {0, 1}, {2, 3}});
    }

    public int solution(int[][] targets){
        int answer = 0;
        
        System.out.println(Arrays.deepToString(targets));
        
        Arrays.sort(targets, (o1, o2) -> {
            return o1[1] - o2[1];
        });

        int endPoint = 0;

        for(int[] target : targets){
            int targetX = target[0];
            int targetY = target[1];

            if(targetX < endPoint){
                continue;
            }

            answer++;

            endPoint = targetY;
        }

        System.out.println(answer);

        return answer;
    }
    
}
