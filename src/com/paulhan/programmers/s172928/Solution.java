package com.paulhan.programmers.s172928;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        for(int col = 0; col < park.length; col++){
            int row = park[col].indexOf("S");
            if(row != -1){
                answer[0] = col;
                answer[1] = row;
                break;
            }
        }

        for(int i = 0; i < routes.length; i++){
            StringTokenizer st = new StringTokenizer(routes[i]);
            String route = st.nextToken();
            int cycle = Integer.parseInt(st.nextToken());

            int[] nextPos = posCalc(route);
            int[] tempPos = answer.clone();

            for(int attempt = 0; attempt < cycle; attempt++){
                try{
                    tempPos[0] += nextPos[0];
                    tempPos[1] += nextPos[1];

                    int col = tempPos[0];
                    int row = tempPos[1];

                    if(park[col].charAt(row) == 'X'){
                        tempPos = answer.clone();
                        break;
                    }
                } catch(IndexOutOfBoundsException e) {
                    tempPos = answer.clone();
                    break;
                }
            }
            
            answer = tempPos.clone();
        }
        
        return answer;
    }

    private int[] posCalc(String route){
        int[] pos;
        switch (route) {
            case "E":
                pos = new int[]{0, 1};
                break;
            case "W":
                pos = new int[]{0, -1};
                break;
            case "S":
                pos = new int[]{1, 0};
                break;
            case "N":
                pos = new int[]{-1, 0};
                break;
            default :
                pos = new int[2];
        }
        return pos;
    }
}
