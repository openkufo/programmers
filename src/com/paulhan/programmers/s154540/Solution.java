package com.paulhan.programmers.s154540;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"});
    }

    public int[] solution(String[] maps) {
        int[] answer = {};
        ArrayList<Integer> indexList = new ArrayList<>();

        for(int row = 0; row < maps.length; row++){
            for(int col = 0; col < maps[row].length(); col++){
                char island = maps[row].charAt(col);

                if(island != 'X'){
                    indexList.add(col);
                }
            }
        }

        System.out.println(indexList.toString());
        return answer;
    }
}
