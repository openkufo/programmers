package com.paulhan.programmers.s138477;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
	public static void main(String[] args) {
		int[] answer = new Solution().solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
		System.out.println(Arrays.toString(answer));
	}
	
	public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> topRatingQueue = new PriorityQueue<Integer>();
        
        for(int i = 0; i < score.length; i++) {
        	topRatingQueue.add(score[i]);
        	
        	if(i / k > 0) {
        		topRatingQueue.remove();
        	}
        	
        	answer[i] = topRatingQueue.peek();
        }
        
        return answer;
    }
}
