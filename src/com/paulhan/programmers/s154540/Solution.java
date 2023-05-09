package com.paulhan.programmers.s154540;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"});
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public int[] solution(String[] maps) {
        int[] answer = {};
        
        int[][] pos = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

        for(int row = 0; row < maps.length; row++){
            for(int col = 0; col < maps[row].length(); col++){
                String cell = maps[row].substring(col, col+1);
                
            }
        }
        return answer;
    }
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