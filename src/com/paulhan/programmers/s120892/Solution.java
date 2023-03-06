package com.paulhan.programmers.s120892;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("dfjardstddetckdaccccdegk",4);
        System.out.println(answer);
    }
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for(int i = code-1; i < cipher.length(); i += code){
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }
}
