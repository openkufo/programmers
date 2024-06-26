package com.paulhan.programmers.s120902;

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution("3 + 4 - 4");
        System.out.println(answer);
    }

    public int solution(String my_string) {
        int answer = 0;
        
        StringTokenizer st = new StringTokenizer(my_string);
        answer = Integer.parseInt(st.nextToken());

        while(st.hasMoreTokens()){
            boolean isPlusOperator = st.nextToken().equals("+");
            if(isPlusOperator){
                answer += Integer.parseInt(st.nextToken());
            } else {
                answer -= Integer.parseInt(st.nextToken());
            }
        }

        return answer;
    }
}
