package com.paulhan.programmers.s120913;

public class Solution {

    public static void main(String[] args) {
        // String[] answer = new Solution().solution("abc1Addfggg4556b", 6);
    }

    public String[] solution(String my_str, int n) {
        int divide = my_str.length() / n;
        int remainder = my_str.length() % n;
        boolean hasRemainder = remainder > 0;

        String[] answer;

        if(hasRemainder){
            answer = new String[divide + 1];
        } else {
            answer = new String[divide];
        }
        
        
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_str.length(); i++){
            sb.append(my_str.charAt(i));

            if((i+1)%n == 0){
                answer[index++] = sb.toString();
                sb.setLength(0);
            }
        }

        if(hasRemainder){
            answer[answer.length - 1] = sb.toString();
        }

        return answer;
    }
}
