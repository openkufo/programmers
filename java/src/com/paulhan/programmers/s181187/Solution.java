package com.paulhan.programmers.s181187;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * x축과 y축으로 이루어진 2차원 직교 좌표계에 중심이 원점인 서로 다른 크기의 원이 두 개 주어집니다.
 * 반지름을 나타내는 두 정수 r1, r2가 매개변수로 주어질 때,
 * 두 원 사이의 공간에 x좌표와 y좌표가 모두 정수인 점의 개수를 return하도록 solution 함수를 완성해주세요.
 * ※ 각 원 위의 점도 포함하여 셉니다.
 * 1 ≤ r1 < r2 ≤ 1,000,000
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Solution solution = new Solution();
        Long answer = solution.solution(9, 20);
        
        bw.append(Long.toString(answer)).append("\n");

        bw.flush();
        bw.close();
    }

    private long solution(int r1, int r2) {
        long answer = 0;

        for(int i = 1; i <= r2; i++){
            double r1Point = getPoint(r1, i);
            double r2Point = getPoint(r2, i);
            
            answer += (long)r2Point - (long) Math.ceil(r1Point) + 1;
        }
        answer *= 4;

        return answer;
    }

    private double getPoint(int r, int pos){
        return Math.sqrt(Math.pow(r, 2) - Math.pow(pos, 2));
    }
}
