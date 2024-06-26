package com.paulhan.programmers.s120861;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11});
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[board.length];
        int x = 0;
        int y = 0;
        int maxWidth = board[0] / 2;
        int maxHeight = board[1] / 2;
        for(String key : keyinput){
            switch (key) {
                case "left":
                    x--;
                    break;
                case "right":
                    x++;
                    break;
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
            }

            if(x > maxWidth){
                x--;
            } else if(x < -maxWidth){
                x++;
            }

            if(y > maxHeight){
                y--;
            } else if(y < -maxHeight){
                y++;
            }
        }

        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
