package com.paulhan.programmers.s178871;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] answer = new Solution().solution(
                                new String[]{"mumu", "soe", "poe", "kai", "mine"}, 
                                new String[]{"kai", "kai", "mine", "mine"});
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        int[] count = new int[players.length];
        int length = count.length;
        for(int i = 0 ; i < count.length; i++){
            count[i] = length--;
        }
        Map<String, Integer> playerIndexMap = new LinkedHashMap<>();
        for(int index = 0; index < players.length; index++){
            playerIndexMap.put(players[index], index);
        }
        
        for(String callPlayer : callings){

        }
        System.out.println(Arrays.toString(count));

        return answer;
    }
}
