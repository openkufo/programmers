package com.paulhan.programmers.s150370;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private LocalDate expiredDate;
    private Map<String, Integer> expiredDateMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws ParseException {
        String date = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] answer = new Solution().solution(date, terms, privacies);
        
        System.out.println("answer : " + Arrays.toString(answer));
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        // LocalDate today = LocalDate.parse(date,formatter);

    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        return answer;
    }

    private initExp

    private LocalDate getExpiredDate(String date){
        return this.expiredDate;
    }

    private void setExpiredDate(String date, String term){
        this.expiredDate = LocalDate.parse(date, DATE_TIME_FORMAT);
    }
}