package com.paulhan.programmers.s120885;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("1001", "1111");
        System.out.println(answer);
    }
    public String solution(String bin1, String bin2) {
        String answer = "";
        int binary1 = Integer.parseInt(bin1, 2);
        int binary2 = Integer.parseInt(bin2, 2);

        answer = Integer.toBinaryString(binary1 + binary2);
        return answer;
    }
}
