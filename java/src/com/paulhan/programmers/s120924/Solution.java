package com.paulhan.programmers.s120924;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[]{-2,0,2,4});
        System.out.println(answer);
    }
    
    public int solution(int[] common) {
        int answer = 0;
        int sequence = 0;

        // Arithmetic Sequence : 등차수열
        boolean isArithmetic = common[1] - common[0] == common[2] - common[1];
        if(isArithmetic){
            sequence = common[1] - common[0];
            answer = common[common.length-1] + sequence;
        } else {
            sequence = common[1] / common[0];
            answer = common[common.length-1] * sequence;
        }
        return answer;
    }
}
