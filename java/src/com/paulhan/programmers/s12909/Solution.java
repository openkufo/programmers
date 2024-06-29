package com.paulhan.programmers.s12909;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws Exception {
        int test = solution("(()(");
    }

    static final int BRACKET_LENGTH = 3;
    static final char[] BRACKET_LEFT = {'(', '{', '['};
    static final char[] BRACKET_RIGHT = {')', '}', ']'};

    public static int solution(String s){
        int answer = -1;
        System.out.println(validBracket(s));
        return answer;
    }

    public static boolean validBracket(String str){
        Stack<Character> bracketStack = new Stack<Character>();
        boolean isValid = true;

        for(int i = 0; i < str.length(); i++){
            char bracket = str.charAt(i);
            for(int j = 0; j < BRACKET_LENGTH; j++){
                if(bracket == BRACKET_LEFT[j]){
                    bracketStack.push(bracket);
                    break;
                } else if(bracket == BRACKET_RIGHT[j]){
                    if(bracketStack.isEmpty() || BRACKET_LEFT[j] != bracketStack.pop()) {
                        isValid = false;
                        break;
                    }
                }
            }

            if(!isValid) {
                break;
            }
        }

        if(!bracketStack.isEmpty()){
            isValid = false;
        }

        return isValid;
    }
}
