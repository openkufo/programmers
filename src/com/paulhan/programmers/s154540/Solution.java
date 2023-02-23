package com.paulhan.programmers.s154540;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

class Board {
    
}

class Island {
    private int day;
    private boolean endSearch = false;
    private final String UP = "UP";
    private final String RIGHT = "RIGHT";
    private final String DOWN = "DOWN";
    private final String LEFT = "LEFT";

    private Map<String, Boolean> directionMap = new HashMap<String, Boolean>();

    Island(int day){
        directionMap.put(UP, false);
        directionMap.put(RIGHT, false);
        directionMap.put(DOWN, false);
        directionMap.put(LEFT, false);
        this.day = day;
    }

    public int getDay() {
        return day;
    }
    
    public boolean isEndSearch() {
        return endSearch;
    }

    public void setEndSearch(boolean endSearch) {
        this.endSearch = endSearch;
    }

    public Map<String, Boolean> getArrowMap(){
        return this.directionMap;
    }

    public boolean getUpDirection(){
        return this.directionMap.get(UP);
    }
    public boolean getRightDirection(){
        return this.directionMap.get(RIGHT);
    }
    public boolean getDownDirection(){
        return this.directionMap.get(DOWN);
    }
    public boolean getDirectionLeft(){
        return this.directionMap.get(LEFT);
    }
    
}