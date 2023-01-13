package com.paulhan.programmers.s120831;

public class Solution {
	public static void main(String[] args) {
		new Solution().solution(10);
	}
	
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	answer += i % 2 == 0 ? i : 0; 
        }
        return answer;
    }
}
