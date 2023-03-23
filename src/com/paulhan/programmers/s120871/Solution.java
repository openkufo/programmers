package com.paulhan.programmers.s120871;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(15);
        System.out.println("answer : " + answer);
    }
    public int solution(int n) {
        int answer = 0;

        int quotient = n / 3;
        int threeCount = getThreeCount(n);
        System.out.println(threeCount);

        int prevValue = -1;
        int curValue = quotient + threeCount;
        int compareValue = n + curValue;

        while(prevValue != curValue){
            curValue = quotient + threeCount;
            prevValue = curValue;
        }

        return answer;
    }

    public int getThreeCount(int n){
        if(n < 10){
            return 0;
        }

        if(n == 100){
            return 9;
        }

        int tens = n / 10 % 10;
        int units = n % 10;
        
        int result = units >= 3 ? tens : tens - 1;
        return result;
    }
}

// 15

/*
 * 15는 3으로 나눈 몫 5와 13이 포함되어 6
 * 15 + 6 = 21
 * 
 * 21 은 3으로 나눈 몫 7과 13이 포함되어 8
 * 21 + 8 - 6 = 23
 * 
 * 23은 3으로 나눈 몫 7과 13, 23이 포함되어 9
 * 23 + 9 - 8 = 24
 * 
 * 24는 3으로 나눈 몫 8과 13, 23이 포함되어 10
 * 24 + 10 - 9 = 25
 * 
 * 25는 3으로 나눈 몫 8과 13, 23이 포함되어 10
 * 25 + 10 - 10 = 25
 * 25는 3으로 나눈 몫 이 없다.
 */