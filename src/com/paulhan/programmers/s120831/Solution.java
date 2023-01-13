package com.paulhan.programmers.s120831;

public class Solution {
	public static void main(String[] args) {
		new Solution().solution(55);
	}
	
	public int solution(int n) {
        int answer = (n/2) * (n/2) + n/2;
        return answer;
    }
}
