package com.paulhan.programmers.s120888;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("people");
        System.out.println(answer);
    }
    public String solution(String my_string) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < my_string.length(); i++){
            String myChar = Character.toString(my_string.charAt(i));

            if(!sb.toString().contains(myChar)){
                sb.append(myChar);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
