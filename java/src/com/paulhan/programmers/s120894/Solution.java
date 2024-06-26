package com.paulhan.programmers.s120894;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1zerotwozero3"));
    }

    public long solution(String numbers) {
        long answer = 0;
        Map<String, String> engNumMap = new HashMap<String, String>();
        engNumMap.put("zero", "0");
        engNumMap.put("one", "1");
        engNumMap.put("two", "2");
        engNumMap.put("three", "3");
        engNumMap.put("four", "4");
        engNumMap.put("five", "5");
        engNumMap.put("six", "6");
        engNumMap.put("seven", "7");
        engNumMap.put("eight", "8");
        engNumMap.put("nine", "9");
        
        for(String key : engNumMap.keySet()){
            numbers = numbers.replaceAll(key, engNumMap.get(key));
        }
        
        answer = Long.parseLong(numbers);
        return answer;
    }
}
