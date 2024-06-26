package com.paulhan.programmers.s120921;

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
		String A = st.nextToken();
		String B = st.nextToken();
		
		int answer = new Solution().solution(A, B);
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
    public int solution(String A, String B) {
        int answer = 0;
        String result = B + B;
        answer = result.indexOf(A);
        return answer;
    }
}
