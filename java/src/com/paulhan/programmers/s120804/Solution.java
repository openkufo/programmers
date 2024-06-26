package com.paulhan.programmers.s120804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        int answer = new Solution().solution(num1, num2);
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
	
	public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}
