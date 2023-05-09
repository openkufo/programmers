package com.paulhan.programmers.s178871;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String[] answer = new Solution().solution(
                            new String[]{"mumu", "soe", "poe", "kai", "mine"}, 
                            new String[]{"kai", "kai", "mine", "mine"}
                            );
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];

        Map<String, Integer> indexMap = new HashMap<>();
        Map<Integer, String> playerMap = new HashMap<>();
        for(int index = 0; index < players.length; index++){
            indexMap.put(players[index], index);
        }

        for(int index = 0; index < players.length; index++){
            playerMap.put(index, players[index]);
        }

        for(String callPlayer : callings){
            int currentRank = indexMap.get(callPlayer);
            String nextPlayer = playerMap.get(currentRank-1);

            playerMap.put(currentRank, nextPlayer);
            playerMap.put(currentRank - 1, callPlayer);

            indexMap.put(callPlayer, currentRank - 1);
            indexMap.put(nextPlayer, currentRank);
        }

        for(String key : indexMap.keySet()){
            answer[indexMap.get(key)] = key;
        }
        return answer;
    }
}
