package com.paulhan.programmers.s120893;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("abCdEfghIJ");
        System.out.println(answer);
    }
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(char alphabet : my_string.toCharArray()){
            alphabet = alphabet >= 97 ? (char) (alphabet - 32) : (char) (alphabet + 32);
            answer.append(alphabet);
        }
        return answer.toString();
    }
}
