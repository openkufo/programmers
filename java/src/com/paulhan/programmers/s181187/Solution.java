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
        Long answer = solution.solution(3, 4);
        
        bw.append(Long.toString(answer));

        bw.flush();
        bw.close();
    }

    public long solution(int r1, int r2) {
        long answer = 0;

        int areaPoint = 1;
        double x = r2 - areaPoint;
        double y = 1;

        while(y < r2){
            while(x > 0){
                if(isValid(r2, x, y, false)){
                    if(isValid(r1, x, y, true)){
                        break;
                    } else {
                        x--;
                        answer++;
                    }
                } else if(isValid(r2, x - (areaPoint + 1), y, false)){
                    areaPoint++;
                    x = r2 - areaPoint;
                }
            }

            x = r2 - areaPoint;
            y++;
        }

        answer += r2 - r1 + 1;
        answer *= 4;

        return answer;
    }

    private boolean isValid(double r, double x, double y, boolean isAbove){
        if(isAbove){
            return Math.pow(r, 2) > Math.pow(-x, 2) + Math.pow(-y, 2);
        } else {
            return Math.pow(r, 2) >= Math.pow(-x, 2) + Math.pow(-y, 2);
        }
    }

}