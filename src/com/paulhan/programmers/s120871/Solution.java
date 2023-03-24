package com.paulhan.programmers.s120871;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(40);
        System.out.println("answer : " + answer);
        System.out.println("test : " + new Solution().test(40));
    }

    public int test(int n){
        int base = 0;
        
        for(int i = 1; i <= n; i++){
            base++;
            
            while(Integer.toString(base).contains("3") || base % 3 == 0){
                base++;
            }
        }
        return base;
    }

    public int solution(int n) {
        int answer = 0;
        int threeCount = 0;
        int prevValue = 0;
        int curValue = 0;

        while(n >= 3){
            threeCount = getThreeCount(n);
            curValue = threeCount;
            n += curValue - prevValue;

            System.out.println("prevValue : " + prevValue);
            System.out.println("curValue : " + curValue);
            if(prevValue == curValue){
                break;
            }

            
            prevValue = curValue;
        }

        answer = n;
        return answer;
    }

    public int getThreeCount(int n){
        if(n < 3){
            return 0;
        }

        int result = n / 3;
        int tens = n / 10 % 10;
        int units = n % 10;

        result += units >= 3 ? tens : tens - 1;
        
        boolean isThirty = n >= 30 && n <= 39 || n >= 130 && n <= 139;
        if(isThirty){
            result += units - 4;    
        } else if(n >= 40 || n >= 140){
            result += 7;
        }
        
        return result;
    }
}