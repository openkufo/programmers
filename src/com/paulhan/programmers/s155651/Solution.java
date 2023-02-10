package com.paulhan.programmers.s155651;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        // String[][] test = {{"10:20", "12:30"}, {"10:00", "10:10"}, {"10:20", "12:30"}, {"10:20", "10:30"}};
        String[][] test = {{"00:00", "00:01"}, {"00:10", "00:20"}};
        // String[][] test = {{"09:10", "10:10"}, {"10:20", "12:20"}};
        // new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}}
        // int answer = new Solution().solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}});
        int answer = new Solution().solution(test);
        System.out.println(answer);
    }
    
    public int solution(String[][] book_time) {
        int answer = 0;

        List<String[]> roomList = new ArrayList<String[]>(Arrays.asList(book_time));
        Collections.sort(roomList, (o1, o2) -> {
            return timeToMinute(o1[0]) - timeToMinute(o2[0]);
        });

        for(String[] room : roomList){
            System.out.println(Arrays.toString(room));
        }

        String prevEndTime;

        while(!roomList.isEmpty()){
            prevEndTime = roomList.get(0)[1];
            roomList.remove(0);

            for(int i = 0; i < roomList.size(); i++){
                String[] times = roomList.get(i);
                boolean shouldAddTime = timeToMinute(prevEndTime) <= (timeToMinute(times[0])-10);
                if(shouldAddTime){
                    prevEndTime = roomList.get(i)[1];
                    roomList.remove(i);
                }
            }

            answer++;
        }
        
        return answer;
    }

    private int timeToMinute(String time){
        StringTokenizer timeTokenizer = new StringTokenizer(time, ":");
        int hour = Integer.parseInt(timeTokenizer.nextToken()) * 60;
        int minute = hour + Integer.parseInt(timeTokenizer.nextToken());
        return minute;
    }
}
