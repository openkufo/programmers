package com.paulhan.programmers.s120891;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(29423);
        System.out.println(answer);
    }
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        for(int i = 0; i < orderStr.length(); i++){
            char temp = orderStr.charAt(i);
            answer += temp != '0' && temp % 3 == 0 ? 1 : 0;
        }
        return answer;
    }
}
