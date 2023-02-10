package com.paulhan.programmers.s155652;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    private static final int LOWERCASE_A = 97;
    public static void main(String[] args) {
        String answer = new Solution().solution("y", "zabcdefg", 1);
        System.out.println("정답 : " + answer);
    }

    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<Character>();
        for(int i = 0; i < skip.length(); i++){
            skipSet.add(skip.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(int sIndex = 0; sIndex < s.length(); sIndex++){
            char alphabet = s.charAt(sIndex);
            for(int i = 0; i < index; i++){
                alphabet++;
                if(alphabet > 'z'){
                    alphabet = (char)((LOWERCASE_A - alphabet) % 26 + LOWERCASE_A);
                }

                while(skipSet.contains(alphabet)){
                    alphabet++;
                    if(alphabet > 'z'){
                        alphabet = (char)((LOWERCASE_A - alphabet) % 26 + LOWERCASE_A);
                    }
                }
            }

            sb.append(alphabet);
        }
        return sb.toString(); 
    }
}
