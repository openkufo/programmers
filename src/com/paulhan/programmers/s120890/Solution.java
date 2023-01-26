package com.paulhan.programmers.s120890;

public class Solution {
    public static void main(String[] args) {
        int[] array = {100,100, 98};
        int n =99;
        int answer = new Solution().solution(array, n);
        System.out.println(answer);
    }
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 101;
        int[] resultArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return array[i];
            }
            resultArray[i] = Math.abs(n-array[i]);
        }

        for(int i = 0; i < resultArray.length; i++){
            if(min > resultArray[i]){
                min = resultArray[i];
            }
        }

        int arrayMin = 101;
        for(int i = 0; i < array.length; i++){
            if(resultArray[i] == min){
                arrayMin = array[i] > arrayMin ? arrayMin : array[i];
            }
        }
        
        answer = arrayMin;
        return answer;
    }
}
