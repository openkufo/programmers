package com.paulhan.programmers.s120884;

public class Solution {
    public static void main(String[] args) {
        int error = 0;
        Solution s = new Solution();
        // int answer = new Solution().solution(0);
        int answer = s.solution(1081);
        
        System.out.println(answer);
    }

    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken % 10;
        for(int service = chicken / 10; service > 0; service /= 10){
            answer += service;
            coupon += service % 10;
            service += coupon >= 10 ? (coupon / 10) * 10 : 0;
            coupon %= 10;
        }
        return answer;
    }
}
