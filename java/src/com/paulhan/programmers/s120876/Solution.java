package com.paulhan.programmers.s120876;

public class Solution {
    public static void main(String[] args) {
        // int answer = new Solution().solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}});
        int answer = new Solution().solution(new int[][]{{0, 5}, {3, 9}, {1, 10}});
        // int answer = new Solution().solution(new int[][]{{-1, 0}, {0, 1}, {1, 2}});
        // int answer = new Solution().solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        System.out.println("answer : " + answer);
    }
    // public int solution(int[][] lines) {
    //     int answer = 0;
    //     int[] addLine = new int[201];

    //     int max = 0;
    //     int min = 200;
    //     for(int i = 0; i < lines.length; i++){
    //         int start = lines[i][0];
    //         int end = lines[i][1];
    //         for(int j = start; j <= end; j++){
    //             int index = j + 100;
    //             addLine[index]++;
    //             max = max < index ? index : max;
    //             min = min > index ? index : min;
    //         }
    //     }
        
    //     int[] resultArray = new int[max-min+1];
    //     for(int i = 0; i < resultArray.length; i++){
    //         resultArray[i] = addLine[min++];
    //     }

    //     for(int i = 0; i < resultArray.length-1; i++){
    //         answer += resultArray[i] >= 2 && resultArray[i+1] >= 2 ? 1 : 0;
    //     }

    //     return answer;
    // }

    public int solution(int[][] lines) {
        int answer = 0;
        int max = -100;
        int min = 100;

        for(int i = 0; i < lines.length; i++){
            min = min > lines[i][0] ? lines[i][0] : min;
            max = max < lines[i][1] ? lines[i][1] : max;
        }
        
        boolean isCurrentOverlap = false;
        boolean isNextOverlap = false;
        for(int index = min; index < max; index++){
            int overlapCount = 0;
            for(int i = 0; i < lines.length; i++){
                isCurrentOverlap = index >= lines[i][0] && index <= lines[i][1];
                isNextOverlap = index + 1 >= lines[i][0] && index + 1 <= lines[i][1];
                overlapCount += isCurrentOverlap && isNextOverlap ? 1 : 0;
            }

            answer += overlapCount >= 2 ? 1 : 0;
        }

        return answer;
    }

}
