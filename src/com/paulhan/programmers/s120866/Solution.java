package com.paulhan.programmers.s120866;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution()
                .solution(new int[][]{
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0}
                });

        System.out.println("answer : " + answer);
    }
    public int solution(int[][] board) {
        int answer = 0;
        int[][] pos = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 0}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };

        for(int col = 0; col < board.length; col++){
            for(int row = 0; row < board[col].length; row++){
                int cell = board[col][row];
                boolean isBomb = cell == 1;
                if(isBomb){
                    for(int i = 0; i < pos.length; i++){
                        try{
                            int x = col + pos[i][0];
                            int y = row + pos[i][1];

                            board[x][y] = board[x][y] != 1 ? 2 : board[x][y];
                        } catch(ArrayIndexOutOfBoundsException e){
                            continue;
                        }
                    }
                }
            }
        }

        for(int col = 0; col < board.length; col++){
            for(int row = 0; row < board[col].length; row++){
                answer += board[col][row] == 0 ? 1 : 0;
            }
        }

        return answer;
    }
}
