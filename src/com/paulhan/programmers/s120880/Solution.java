package com.paulhan.programmers.s120880;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        System.out.println("[1, 2, 3, 4, 5, 6]");
        System.out.println(Arrays.toString(answer));

        System.out.println("--답--");
        System.out.println("[4, 5, 3, 6, 2, 1]");
        System.out.println("[0, -1, 1, -2, 2, 3]");
    }
    public int[] solution(int[] numlist, int n) {
        // List<Integer> numList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        List<Integer> numList = new ArrayList<>();
        for(int i = 0 ; i < numlist.length; i++){
            numList.add(numlist[i]);
        }
        numList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int diff1 = Math.abs(n - o1);
                int diff2 = Math.abs(n - o2);
                if(diff1 == diff2){
                    return o2 - o1;
                }
                return diff1 - diff2;
            }
        });

        int[] answer = numList.stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
                              
        return answer;
    }
}
