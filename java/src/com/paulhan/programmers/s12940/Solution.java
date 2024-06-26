package com.paulhan.programmers.s12940;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] answer = new Solution().solution(2, 5);
		System.out.println(Arrays.toString(answer));
	}
	
	public int[] solution(int n, int m) {
        int gcd = 0; // Greatest Common Divisor
        int lcm = 0; // Least Common Multiple
        
        gcd = getGcd(n, m);
        lcm = n * m / gcd;
        
        int[] answer = new int[]{gcd, lcm};
        return answer;
    }
	
	public int getGcd(int p, int q){
		return q != 0 ? getGcd(q, p%q) : p;
	}
}
