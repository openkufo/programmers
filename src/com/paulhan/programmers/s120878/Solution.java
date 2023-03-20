package com.paulhan.programmers.s120878;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(7, 20);
        System.out.println("answer : " + answer);
    }

    public int solution(int a, int b) {
        int answer = 0;
        double result = (double) a / b;
        answer = Double.toString(result).length() >= 16 ? 2 : 1;
        return answer;
    }

    private static int gcd(int a, int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
