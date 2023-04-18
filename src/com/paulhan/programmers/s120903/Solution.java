package com.paulhan.programmers.s120903;

public class Solution {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        int answer = new Solution().solution(s2, s1);
        System.out.println(answer);
    }

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s1Str : s1) {
            for (String s2Str : s2) {
                answer += s1Str.equals(s2Str) ? 1 : 0;
            }
        }
        return answer;
    }
}
