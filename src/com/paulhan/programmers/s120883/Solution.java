package com.paulhan.programmers.s120883;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] id_pw = new String[]{"meosseugi", "1234"};
        id_pw = new String[]{"programmer01", "15789"};

        String[][] db = new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        db = new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String answer = new Solution().solution(id_pw, db);
        System.out.println(answer);
    }

    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                answer = "wrong pw";
                if(id_pw[1].equals(db[i][1])){
                    answer = "login";
                }
            }
        }
        return answer;
    }
}

