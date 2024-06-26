package com.paulhan.programmers.s120886;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution("olleh", "hello");
        System.out.println("answer : " + answer);
    }

    public int solution(String before, String after) {
        int answer = 0;
        before = before.chars()
                    .sorted()
                    .collect(StringBuilder::new,
                             StringBuilder::appendCodePoint,
                             StringBuilder::append)
                    .toString();

        after = after.chars()
                    .sorted()
                    .collect(StringBuilder::new,
                             StringBuilder::appendCodePoint,
                             StringBuilder::append)
                    .toString();
        
        answer = before.equals(after) ? 1 : 0;
        return answer;
    }
}
