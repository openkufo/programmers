package com.paulhan.programmers.s161990;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] answer = new Solution().solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
        System.out.println("answer : " + Arrays.toString(answer));
    }
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        for(int i = 0; i < wallpaper.length; i++){
            wallpaper[i].indexOf("#");
        }
        return answer;
    }
}
