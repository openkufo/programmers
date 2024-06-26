package com.paulhan.programmers.s120896;

public class Solution {
    public static void main(String[] args) {
        String answer = new Solution().solution("abcabcabcdefg");
        System.out.println(answer);
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char searchChar = s.charAt(i);
            int firstChar = s.indexOf(searchChar);
            int secondChar = s.lastIndexOf(searchChar);

            if(firstChar == secondChar){
                sb.append(searchChar);
            }
        }

        return sb.chars()
                 .sorted()
                 .collect(StringBuilder::new,
                          StringBuilder::appendCodePoint,
                          StringBuilder::append)
                .toString();
    }
}
