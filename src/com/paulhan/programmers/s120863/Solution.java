package com.paulhan.programmers.s120863;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("3x + 7 + x");
        System.out.println(answer);
    }

    public String solution(String polynomial) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(polynomial, " + ");

        int variable = 0;
        int constant = 0;

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            try{
                constant += Integer.parseInt(token);
            }catch(NumberFormatException e){
                token = token.replace("x", "");
                if(token.equals("")){
                    variable++;
                    continue;
                }
                variable += Integer.parseInt(token);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(variable == 1){
            sb.append("x");
        } else if(variable != 0){
            sb.append(variable).append("x");
        }

        if(variable == 0 && constant != 0){
            sb.append(constant);
        } else if(constant != 0){
            sb.append(" + ").append(constant);
        }

        answer = sb.toString();

        return answer;
    }
}
