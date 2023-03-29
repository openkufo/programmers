package com.paulhan.programmers.s120866;

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
    }
    public int solution(int[][] board) {
        int answer = 0;
        int mine = 0;
        for(int col = 0; col < board.length; col++){
            for(int row = 0; row < board[col].length; row++){
                int cell = board[col][row];

            }
        }
        return answer;
    }
}
