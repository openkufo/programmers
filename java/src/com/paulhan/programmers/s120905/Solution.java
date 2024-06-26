package com.paulhan.programmers.s120905;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] numlist = new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int n = 3;
		int[] answer = new Solution().solution(n, numlist);
		System.out.println(Arrays.toString(answer));
	}
	
	public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int multipleCount = 0;
        
        for(int i = 0; i < numlist.length; i++) {
        	if(numlist[i] % n == 0) {
        		multipleCount++;
        	} else {
        		numlist[i] = 0;
        	}
        }
        
        answer = new int[multipleCount];
        
        int answerIndex = 0;
        
        for(int i = 0; i < numlist.length; i++) {
        	if(numlist[i] != 0) {
        		answer[answerIndex++] = numlist[i];
        	}
        }
        return answer;
    }
}
