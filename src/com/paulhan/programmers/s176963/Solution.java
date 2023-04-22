package com.paulhan.programmers.s176963;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // int[] answer = new Solution().solution(new String[]{"kali", "mari", "don"}
        //                                     , new int[]{11, 1, 55}
        //                                     , new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}});
        
        int[] answer = new Solution().solution(new String[]{"may", "kein", "kain", "radi"}
                                        , new int[]{5, 10, 1, 3}
                                        , new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> yearningMap = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            yearningMap.put(name[i], yearning[i]);
        }


        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                String photoName = photo[i][j];

                if(yearningMap.containsKey(photoName)){
                    answer[i] += yearningMap.get(photoName);
                }
            }
        }
        return answer;
    }
}
