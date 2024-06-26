package com.paulhan.programmers.s120869;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
        System.out.println("answer : " + answer);
    }

    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String dicWord : dic){
            int count = 0;
            
            for(String spellWord : spell){
                count += dicWord.contains(spellWord) ? 1 : 0;
            }

            if(count == spell.length){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
