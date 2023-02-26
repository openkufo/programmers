package com.paulhan.programmers.s120897;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(24);
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answerList.add(i);
            }
        }

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
