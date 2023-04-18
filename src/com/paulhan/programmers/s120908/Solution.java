package com.paulhan.programmers.s120908;

public class Solution {
    public static void main(String[] args) {
        // int answer = new Solution().solution("ab6CDE443fgh22iJKlmn1o", "6CD");
    }

    public int solution(String str1, String str2) {
        int answer = str1.contains(str2) ? 1 : 2;
        return answer;
    }
}
