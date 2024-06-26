package com.paulhan.programmers.s120956;

public class Solution {
	public static void main(String[] args) {
		String[] babbling = new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int answer = new Solution().solution(babbling);
		System.out.println(answer);
	}
	
	public int solution(String[] babbling) {
        int answer = 0;
        String[] eng = new String[] {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
        	for(int j = 0; j < eng.length; j++) {
            	babbling[i] = babbling[i].replace(eng[j], " ");
            }
        	
        	babbling[i] = babbling[i].trim();
        	
        	if(babbling[i].length() == 0) {
        		answer++;
        	}
        }
        
        return answer;
    }
}
