package com.paulhan.programmers.s76502;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

class Solution {
    
    static final int BRACKET_LENGTH = 3;
    static final char[] BRACKET_LEFT = {'(', '{', '['};
    static final char[] BRACKET_RIGHT = {')', '}', ']'};
    
    public static void main(String[] args) {
        new Solution().solution("[](){}");
    }

    public int solution(String s) {
        int answer = 0;

        Deque<Character> bracketDeque = new ArrayDeque<Character>();
        for(char data : s.toCharArray()){
            bracketDeque.add(data);
        }

        for(int i = 0; i < bracketDeque.size(); i++){
            answer = validBracket(bracketDeque.iterator()) ? answer + 1 : answer;
            char bracket = bracketDeque.poll();
            bracketDeque.addLast(bracket);
        }
        
        return answer;
    }
    
    private boolean validBracket(Iterator<Character> bracketIter){
        Stack<Character> bracketStack = new Stack<Character>();
        boolean isValid = true;

        while(bracketIter.hasNext()){
            char bracket = bracketIter.next();
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
