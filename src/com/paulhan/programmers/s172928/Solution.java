package com.paulhan.programmers.s172928;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        
        for(int i = 0; i < park.length; i++){
            
            System.out.print("loc : ");
            for(int j = 0; j < park[i].length(); j++){
                char loc = park[i].charAt(j);
                System.out.print(loc);
            }
            System.out.println();
        }

        return answer;
    }
}
