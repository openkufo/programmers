package com.paulhan.programmers.s120904;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(29183, 3);
        System.out.println(answer);
    }
    public int solution(int num, int k) {
        int answer = -1;
        String numStr = Integer.toString(num);
        for(int i = 0; i < numStr.length(); i++){
            if(numStr.charAt(i) == k+48){
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}
