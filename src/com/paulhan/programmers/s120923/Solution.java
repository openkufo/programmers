package com.paulhan.programmers.s120923;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Test
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int[] answer = new Solution().solution(num, total);
        bw.write(Arrays.toString(answer) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private int[] solution(int num, int total){
        int[] answer = new int[num];
        int median = total / num;
        int position = num / 2;
        if(num % 2 == 0){
            position--;
        }

        int firstNum = median - position;
        for(int i = 0; i < num; i++){
            answer[i] = firstNum++;
        }

        return answer;
    }
}