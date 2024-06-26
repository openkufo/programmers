package com.paulhan.programmers.s120864;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution("aAb1B2cC34oOp");
        System.out.println("answer : " + answer);
    }
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            char myChar = my_string.charAt(i);
            char nextChar = ' ';
            if(i + 1 != my_string.length()){
                nextChar = my_string.charAt(i+1);
            }
            if(Character.isAlphabetic(myChar)){
                continue;
            }
            sb.append(myChar);
            if(Character.isAlphabetic(nextChar) || nextChar == ' '){
                answer += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
            }
        }
        return answer;
    }
}
